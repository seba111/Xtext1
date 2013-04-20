package org.xtext.function.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.xtext.function.function.Model
import org.xtext.function.function.Expression
import org.xtext.function.function.TerminalExpression
import org.xtext.function.function.MathFunction
import org.xtext.function.function.VariableDefinition
import org.xtext.function.function.MathTwoArg
import org.xtext.function.function.MathOneArg
import org.xtext.function.function.Start
import org.eclipse.xtext.common.types.util.TypeReferences
import static extension org.eclipse.xtext.EcoreUtil2.*
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import org.eclipse.xtext.common.types.JvmVisibility

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class FunctionJvmModelInferrer extends AbstractModelInferrer {
	int numberOfCommand = 0

    /**
     * convenience API to build and initialize JVM types and their members.
     */
	@Inject extension JvmTypesBuilder
	@Inject TypeReferences typeReferences

	/**
	 * The dispatch method {@code infer} is called for each instance of the
	 * given element's type that is contained in a resource.
	 * 
	 * @param element
	 *            the model to create one or more
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType declared
	 *            types} from.
	 * @param acceptor
	 *            each created
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType type}
	 *            without a container should be passed to the acceptor in order
	 *            get attached to the current resource. The acceptor's
	 *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
	 *            accept(..)} method takes the constructed empty type for the
	 *            pre-indexing phase. This one is further initialized in the
	 *            indexing phase using the closure you pass to the returned
	 *            {@link org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
	 *            initializeLater(..)}.
	 * @param isPreIndexingPhase
	 *            whether the method is called in a pre-indexing phase, i.e.
	 *            when the global index is not yet fully updated. You must not
	 *            rely on linking using the index if isPreIndexingPhase is
	 *            <code>true</code>.
	 */
   	def dispatch void infer(Model element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		// Here you explain how your model is mapped to Java elements, by writing the actual translation code.
   		

		acceptor.accept(element.toClass("Main")).initializeLater([
			val param = newTypeRef(typeof(String)).addArrayTypeDimension
			
			members += toMethod("main",element.newTypeRef(Void::TYPE))[
				setStatic(true)
				parameters += toParameter("args",param)
				body = [		// przechodzimy po wszystkich Expression i sprawdzamy czy dany Expression jest korzeniem wyra¿eñ Expression
					append( 	//Nastepnie to samo ze wszystkimi elementami Math
						'''
						«FOR st : element.eAllOfType(typeof(Start))»
							«FOR ex : st.eAllOfType(typeof(Expression))»
								«IF !ex.eContainer.toString.contains("Expression") && !ex.eContainer.toString.contains("MathTwoArg") 
								&& !ex.eContainer.toString.contains("MathOneArg")» 
									double tmp«addOneToCommandNumber()» = «checkType(ex.left)» 
									«FOR el : ex.right»
										«ex.op» «checkType(el)» 
									«ENDFOR»
									;System.out.println(tmp«numberOfCommand»);
								«ENDIF»
							«ENDFOR»
							«FOR ex : st.eAllOfType(typeof(MathOneArg))»
								«IF !ex.eContainer.toString.contains("Expression") && !ex.eContainer.toString.contains("MathTwoArg") 
								&& !ex.eContainer.toString.contains("MathOneArg") » 
									double tmp«addOneToCommandNumber()» = «checkType(ex)» 
									;System.out.println(tmp«numberOfCommand»);
								«ENDIF»
							«ENDFOR»
							«FOR ex : st.eAllOfType(typeof(MathTwoArg))»
								«IF !ex.eContainer.toString.contains("Expression") && !ex.eContainer.toString.contains("MathTwoArg") 
								&& !ex.eContainer.toString.contains("MathOneArg") » 
									double tmp«addOneToCommandNumber()» = «checkType(ex)» 
									;System.out.println(tmp«numberOfCommand»);
								«ENDIF»
							«ENDFOR»
							«FOR ex : st.eAllOfType(typeof(VariableDefinition))»
								double «ex.name» = «ex.number»;
							«ENDFOR»
						«ENDFOR»
						'''
						
					)
				]
			]
			
		])
   		}
   		def protected checkType(Object ob)
   		{				
	   		switch ob {
	   			Expression:
	   			'''
					(«checkType(ob.left)» 
	   				«FOR el : ob.right»
						«ob.op» «checkType(el)» 
					«ENDFOR»
					)
	   			'''
	   			MathTwoArg:
	   			'''
	   				«IF ob.function == 'pow'»
	   				(Math.pow(«checkType(ob.left)», «checkType(ob.right)»))
	   				«ELSEIF ob.function == 'max'»
	   				(Math.max(«checkType(ob.left)», «checkType(ob.right)»))
	   				«ELSEIF ob.function == 'min'»
	   				(Math.min(«checkType(ob.left)», «checkType(ob.right)»))
	   				«ENDIF»
	   			'''
	   			MathOneArg:
	   			'''
	   				«IF ob.function == 'sqrt'»
	   				(Math.sqrt(«checkType(ob.left)»))
	   				«ELSEIF ob.function == 'log'»
	   				(Math.log(«checkType(ob.left)»))
	   				«ENDIF»
	   			'''
	   			TerminalExpression:
	   			'''	   				
	   				«IF ob.value != null»
	   					«ob.value»
	   				«ELSE»
	   					«ob.variable.name»
	   				«ENDIF»
	   			'''
	   		}
   		}
   		def protected int addOneToCommandNumber()
		{		
			numberOfCommand = numberOfCommand +1
			return numberOfCommand
		}	  		
   	}
   	
   	/*    int a = (int) (1 + Math.PI);
    a = Math.max(1, 2);
    a = Math.min(1, 2);
    a = (int) Math.pow(1, 2);
    a = (int) Math.sqrt(2);
    a = (int) Math.log(1);
    * 
    * Dodawanie i odejmowanie stringów;
    String t = "ala";
    String g = "a";
    t = t.replaceAll("la", "");

 //   t=t+g;
    System.out.println(t); 
    * 
    * Porównania zwracaj¹ce bool
    * (equal? X Y)
    * (less? X Y)
    * (greater? X Y)
    * 
    * 
    * definicja zmiennej
    * (define nasze_pi 3.14)
    * 
    * definicja funkcji
    * (define (ObwodKola promien) (* 2 nasze_pi promien)))
    * 
    * wywo³anie funkcji
    * (ObwodKola 7)
    * 
    * */
   	
   	


