package tests;
import java.util.ArrayList;

import org.xtext.function.FunctionUiInjectorProvider;
import org.xtext.function.function.FunctionDefinition;
import org.xtext.function.function.Model;
import org.xtext.function.function.Expression;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.eclipse.emf.ecore.EObject;

import com.google.inject.Inject;

@RunWith(XtextRunner.class)
@InjectWith(FunctionUiInjectorProvider.class)
public class ParserTests {
	
	@Inject private ParseHelper<Model> parseHelper;
	 @Inject
	  private ValidationTestHelper _validationTestHelper;
	
	private Model model;
	
	@Before
	public void prepare(){
		StringBuilder modelString = new StringBuilder();
		modelString.append("( + 1.0 2.0) (sqrt 2.0) ( + 1.0 2.0) ");
		try{
			model = parseHelper.parse(modelString);
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
			
	}
	
	@Test
	public void test1(){			
		int numberOfElements = 0;
		for(EObject par : model.eContents()){
			numberOfElements++;
		}
		Assert.assertEquals(3, numberOfElements);

	}
	
	
	
	
	
	/*
	@Test
	public void test2(){
		StringBuilder modelString = new StringBuilder();
		modelString.append("(define(Fun _a) (* _a _a)) (define(Fun _a _b) (+ _b _a)) ");
		try{
			model2 = parseHelper.parse(modelString);
		
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}	
	}*/


}
