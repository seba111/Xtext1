package tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.xtext.function.function.Model;
import org.junit.runner.RunWith
import org.xtext.function.FunctionUiInjectorProvider
import org.xtext.function.function.FunctionDefinition
import org.xtext.function.function.impl.FunctionPackageImpl

import static org.xtext.function.validation.FunctionJavaValidator.*
import static org.xtext.function.function.FunctionPackage$Literals.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(FunctionUiInjectorProvider))

class ValidationTests {

	@Inject extension ParseHelper<Model> 
	@Inject extension ValidationTestHelper
	
	@Test
	def testDuplicateFuncionDefinitionName(){
		'''
		(define(Fun _a) (* _a _a)) 
		(define(Fun _a _b) (+ _b _a))
		'''.parse.assertError(FUNCTION_DEFINITION,"101")
	}
		@Test
	def testNumberOfParameters(){
		'''
		(define(Fun _a) (* _a _a)) 
		(call Fun 1.0 1.0)
		'''.parse.assertError(FUNCTION_CALL,"102")
	} 	 	
}