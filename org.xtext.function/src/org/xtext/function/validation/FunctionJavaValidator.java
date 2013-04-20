package org.xtext.function.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.function.function.FunctionPackage;
import org.xtext.function.function.FunctionDefinition;
import org.xtext.function.function.Parameter;
 

public class FunctionJavaValidator extends AbstractFunctionJavaValidator {

	
	@Check
	public void checkFunctionNameIsNotDuplicated(FunctionDefinition fd){
		FunctionDefinition temporaryFd;
		org.eclipse.emf.ecore.EObject tmp = fd.eContainer();
		for(org.eclipse.emf.ecore.EObject par : tmp.eContents()){
			if(par instanceof FunctionDefinition){
				temporaryFd = (FunctionDefinition)par;
				if(fd.hashCode() != temporaryFd.hashCode()){
					if(fd.getName().equals(temporaryFd.getName())){
						error("Nazwa funkcji nie mo¿e siê powtarzaæ", FunctionPackage.Literals.FUNCTION_DEFINITION__NAME);
					}
				}
			}
		}			
	}
	
	/*
	@Check
	public void checkParameterBelongToFunction(FunctionDefinition fd){
		boolean ok = false;
		System.out.println("W checku dla: "+ fd.toString());
		for(org.eclipse.emf.ecore.EObject par : fd.eContents()){
			System.out.println("Jego contents: "+ par.toString());	
			
			if(par instanceof Parameter){
				System.out.println("Jest parametr");
				Parameter tmp = (Parameter)par;
				System.out.println("Jego Container: " + tmp.eContainer());
				if(tmp.eContainer() == fd)
					System.out.println("Hura ten parametr nale¿y do tej funkcji");
				else
					System.out.println("Niestety ten parametr nie nale¿y do tej funkcji");
			}/*
				ok= false;
				org.eclipse.emf.ecore.EObject tmp = par;
				while(tmp.eContainer() != null){
					if(par.eContainer() == fd){
						ok = true;
					}
					else
					{
						tmp = tmp.eContainer();
					}
				}
				if(!ok)
					error("Parametr musi pochodziæ z danej funkcji", FunctionPackage.Literals.FUNCTION_DEFINITION__EXP);

			}*/
				
	//	}
//	}
	
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}

}
