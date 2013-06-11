package org.xtext.function.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.xtext.function.function.Model
import org.xtext.function.function.Expression
import org.xtext.function.function.TerminalExpression
import org.xtext.function.function.ExpressionInFun
import org.xtext.function.function.TerminalExpressionInFun
import org.xtext.function.function.MathFunction
import org.xtext.function.function.VariableDefinition
import org.xtext.function.function.FunctionDefinition
import org.xtext.function.function.MathTwoArg
import org.xtext.function.function.MathOneArg
import org.xtext.function.function.MathTwoArgInFun
import org.xtext.function.function.MathOneArgInFun
import org.xtext.function.function.Start
import org.xtext.function.function.IfStatement
import org.xtext.function.function.FunctionCall
import org.xtext.function.function.Parameter
import org.eclipse.xtext.common.types.util.TypeReferences
import static extension org.eclipse.xtext.EcoreUtil2.*
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.emf.ecore.EObject

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
			
			for(FunctionDefinition fd: element.eAllOfType(typeof(FunctionDefinition))){
				members += fd.toMethod(fd.name,newTypeRef("double"))[
				setStatic(true)
				for(Parameter par: fd.parameters){
					parameters += toParameter(par.name,element.newTypeRef('double'))
				}
				
				body = [
					append(
						'''
							«FOR ex : fd.eAllOfType(typeof(ExpressionInFun))»															
								«IF ex.eContainer.toString.contains("FunctionDefinition")»
									double tmp«addOneToCommandNumber()» = «checkTypeInFunction(ex.left)» 
									«FOR el : ex.right»
										«ex.op» «checkTypeInFunction(el)» 
									«ENDFOR»
									;return tmp«numberOfCommand»;
								«ENDIF»						
							«ENDFOR»
							«FOR ex : fd.eAllOfType(typeof(MathTwoArgInFun))»															
								«IF ex.eContainer.toString.contains("FunctionDefinition")»
									double tmp«addOneToCommandNumber()» = «checkTypeInFunction(ex)» 
									;return tmp«numberOfCommand»;
								«ENDIF»						
							«ENDFOR»
							«FOR ex : fd.eAllOfType(typeof(MathOneArgInFun))»															
								«IF ex.eContainer.toString.contains("FunctionDefinition")»
									double tmp«addOneToCommandNumber()» = «checkTypeInFunction(ex)» 
									;return tmp«numberOfCommand»;
								«ENDIF»						
							«ENDFOR»
						'''
					)
				]
					
				]
			}
			
			members += toMethod("main",element.newTypeRef(Void::TYPE))[
				setStatic(true)
				parameters += toParameter("args",param)
				body = [		
					append( 	
						'''
						«FOR st : element.eAllOfType(typeof(Start))»
							«readExpressions(st)»
						«ENDFOR»
						'''
						
					)
				]
			]
			
		])
   		}
   		def protected readExpressions(EObject eob){ // przechodzimy po wszystkich Expression i sprawdzamy czy dany Expression jest korzeniem wyra¿eñ Expression
   			'''
   				«FOR ex : eob.eAllOfType(typeof(Expression))» 
					«IF !ex.eContainer.toString.contains("Expression") && !ex.eContainer.toString.contains("MathTwoArg") 
					&& !ex.eContainer.toString.contains("MathOneArg")&& !ex.eContainer.toString.contains("IfStatement")» 
						double tmp«addOneToCommandNumber()» = «checkType(ex.left)» 
						«FOR el : ex.right»
							«ex.op» «checkType(el)» 
						«ENDFOR»
						;System.out.println(tmp«numberOfCommand»);
					«ENDIF»
				«ENDFOR»
				«FOR ex : eob.eAllOfType(typeof(MathOneArg))»
					«IF !ex.eContainer.toString.contains("Expression") && !ex.eContainer.toString.contains("MathTwoArg") 
					&& !ex.eContainer.toString.contains("MathOneArg")&& !ex.eContainer.toString.contains("IfStatement") » 
						double tmp«addOneToCommandNumber()» = «checkType(ex)» 
						;System.out.println(tmp«numberOfCommand»);
					«ENDIF»
				«ENDFOR»
				«FOR ex : eob.eAllOfType(typeof(MathTwoArg))»
					«IF !ex.eContainer.toString.contains("Expression") && !ex.eContainer.toString.contains("MathTwoArg") 
					&& !ex.eContainer.toString.contains("MathOneArg")&& !ex.eContainer.toString.contains("IfStatement") » 
						double tmp«addOneToCommandNumber()» = «checkType(ex)» 
						;System.out.println(tmp«numberOfCommand»);
					«ENDIF»
				«ENDFOR»
				«FOR ex : eob.eAllOfType(typeof(VariableDefinition))»
					double «ex.name» = «ex.number»;
				«ENDFOR»
				«FOR ex : eob.eAllOfType(typeof(FunctionCall))»
					«IF ex.eContainer.toString.contains("Model")»
						double tmp«addOneToCommandNumber()» = «ex.func.name»(
						«FOR param : ex.paramvalues»
	   						«IF param == ex.paramvalues.last» 
	   							«IF param.value != null»
	   								«param.value»
	   							«ELSEIF param.variable != null»
	   								«param.variable.number»
	   							«ENDIF»
	   						«ELSE»
	   							«IF param.value != null»
	   								«param.value»,
	   							«ELSEIF param.variable != null»
	   								«param.variable.number»,
	   							«ENDIF»
	   						«ENDIF»
	   					«ENDFOR» 
						);System.out.println(tmp«numberOfCommand»);
					«ENDIF»
				«ENDFOR»
				«FOR ex : eob.eAllOfType(typeof(IfStatement))»
					double tmp«addOneToCommandNumber()»;
					«IF ex.iftype == 'equal'»
					if( («checkType(ex.left)») == («checkType(ex.right)»)){
						tmp«numberOfCommand» = «checkType(ex.whentrue)»	;
					}else{
						tmp«numberOfCommand» = «checkType(ex.whenfalse)»;
					}
					«ENDIF»
					«IF ex.iftype == 'greater'»
					if( («checkType(ex.left)») >= («checkType(ex.right)»)){ 
						tmp«numberOfCommand» = «checkType(ex.whentrue)»;
					}else{
						tmp«numberOfCommand» = «checkType(ex.whenfalse)»;
					}
					«ENDIF»
					«IF ex.iftype == 'less'»
					if( («checkType(ex.left)») <= («checkType(ex.right)»)){
						tmp«numberOfCommand» = «checkType(ex.whentrue)»	;
					}else{
						tmp«numberOfCommand» = «checkType(ex.whenfalse)»;
					}
					«ENDIF»
					
					System.out.println(tmp«numberOfCommand»);
				«ENDFOR»
			'''	
   		}
   		def protected checkType(Object ob)
   		{
   			var numInFor = 0				
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
	   				«ELSEIF ob.function == 'ceil'»
	   				(Math.ceil(«checkType(ob.left)»))
	   				«ELSEIF ob.function == 'floor'»
	   				(Math.floor(«checkType(ob.left)»))
	   				«ENDIF»
	   			'''
	   			TerminalExpression:
	   			
	   			'''	   				
	   				«IF ob.value != null»
	   					«ob.value»
	   				«ELSEIF ob.variable != null»
	   					«ob.variable.name»
	   				«ELSEIF ob.functioncall != null»
	   					«ob.functioncall.func.name»(
	   					«FOR param : ob.functioncall.paramvalues»
	   						«IF param == ob.functioncall.paramvalues.last»
	   							«IF param.value != null»
	   								«param.value»
	   							«ELSEIF param.variable != null»
	   								«param.variable.name»
	   							«ENDIF»
	   						«ELSE»
	   							«IF param.value != null»
	   								«param.value»,
	   							«ELSEIF param.variable != null»
	   								«param.variable.name»,
	   							«ENDIF»
	   						«ENDIF»
	   					«ENDFOR»
	   					)	   					
	   				«ENDIF»
	   			'''
	   		}
   		}
   		def protected checkParamValuesType(Object ob)
   		{
   //			switch ob{
   				
   //			}	
   		}
    	def protected checkTypeInFunction(Object ob)
   		{				
	   		switch ob {
	   			ExpressionInFun:
	   			'''
					(«checkTypeInFunction(ob.left)» 
	   				«FOR el : ob.right»
						«ob.op» «checkTypeInFunction(el)» 
					«ENDFOR»
					)
	   			'''
	   			MathTwoArgInFun:
	   			'''
	   				«IF ob.function == 'pow'»
	   				(Math.pow(«checkTypeInFunction(ob.left)», «checkTypeInFunction(ob.right)»))
	   				«ELSEIF ob.function == 'max'»
	   				(Math.max(«checkTypeInFunction(ob.left)», «checkTypeInFunction(ob.right)»))
	   				«ELSEIF ob.function == 'min'»
	   				(Math.min(«checkTypeInFunction(ob.left)», «checkTypeInFunction(ob.right)»))
	   				«ENDIF»
	   			'''
	   			MathOneArgInFun:
	   			'''
	   				«IF ob.function == 'sqrt'»
	   				(Math.sqrt(«checkTypeInFunction(ob.left)»))
	   				«ELSEIF ob.function == 'log'»
	   				(Math.log(«checkTypeInFunction(ob.left)»))
	   				«ELSEIF ob.function == 'ceil'»
	   				(Math.ceil(«checkTypeInFunction(ob.left)»))
	   				«ELSEIF ob.function == 'floor'»
	   				(Math.floor(«checkTypeInFunction(ob.left)»))
	   				«ENDIF»
	   			'''
	   			TerminalExpressionInFun:
	   			'''	   				
	   				«IF ob.value != null»
	   					«ob.value»
	   				«ELSEIF ob.parameter != null»
	   					«ob.parameter.name»
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
   	

   	
/* przyk³adowy kod
 * 
 

(+ 1.0 2.0)
(- 1.0 2.0)
(* 1.0 2.0)
(/ 1.0 2.0)
 
(min 1.0 2.0)
(max 1.0 2.0)
(pow 1.0 2.0)
(sqrt 2.0)
(log 2.0)
(ceil 11.8)
(floor 11.8)

(+ 
	(pow 
		1.0 
		(log 2.0)
	) 
	2.0
)
(+ (pow 1.0 (log 2.0)) 2.0)

(define Zmienna 9.0)
(define Zmiennaa 10.0)

(+ 2.0 Zmienna)


(define (NazwaFunkcji _paramA _paramB)
	(+ 
		4.0 
		(pow _paramA _paramB)
	)
) 
(define (FunkcjaBezParametrow)
	(* 
		(ceil (log 2.0))
		(pow 1.0 1.0)
	)
) 


(call NazwaFunkcji 2.0 Zmienna) 
          
                     
(+ 
	Zmienna 
	(max 
		(call NazwaFunkcji Zmienna 4.0) 
		(call NazwaFunkcji 3.0 1.0)  
	)
) 



( if 
	(equal (+ Zmienna 1.0) (- 3.0 1.0))
	then{
		(+ 1.0 1.0)
	}
	else{
		(pow 2.0 (call NazwaFunkcji 2.0 1.0))		
	}   
)
 */

