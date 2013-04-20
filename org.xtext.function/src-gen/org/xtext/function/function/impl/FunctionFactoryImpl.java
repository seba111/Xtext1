/**
 */
package org.xtext.function.function.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.function.function.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionFactoryImpl extends EFactoryImpl implements FunctionFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FunctionFactory init()
  {
    try
    {
      FunctionFactory theFunctionFactory = (FunctionFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/function/Function"); 
      if (theFunctionFactory != null)
      {
        return theFunctionFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FunctionFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FunctionPackage.MODEL: return createModel();
      case FunctionPackage.START: return createStart();
      case FunctionPackage.EXP_WITH_DEFINITIONS: return createExpWithDefinitions();
      case FunctionPackage.EXP: return createExp();
      case FunctionPackage.EXPRESSION: return createExpression();
      case FunctionPackage.TERMINAL_EXPRESSION: return createTerminalExpression();
      case FunctionPackage.MATH_FUNCTION: return createMathFunction();
      case FunctionPackage.MATH_TWO_ARG: return createMathTwoArg();
      case FunctionPackage.MATH_ONE_ARG: return createMathOneArg();
      case FunctionPackage.VARIABLE_DEFINITION: return createVariableDefinition();
      case FunctionPackage.FUNCTION_DEFINITION: return createFunctionDefinition();
      case FunctionPackage.PARAMETER: return createParameter();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Start createStart()
  {
    StartImpl start = new StartImpl();
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpWithDefinitions createExpWithDefinitions()
  {
    ExpWithDefinitionsImpl expWithDefinitions = new ExpWithDefinitionsImpl();
    return expWithDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp createExp()
  {
    ExpImpl exp = new ExpImpl();
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminalExpression createTerminalExpression()
  {
    TerminalExpressionImpl terminalExpression = new TerminalExpressionImpl();
    return terminalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathFunction createMathFunction()
  {
    MathFunctionImpl mathFunction = new MathFunctionImpl();
    return mathFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathTwoArg createMathTwoArg()
  {
    MathTwoArgImpl mathTwoArg = new MathTwoArgImpl();
    return mathTwoArg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathOneArg createMathOneArg()
  {
    MathOneArgImpl mathOneArg = new MathOneArgImpl();
    return mathOneArg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDefinition createVariableDefinition()
  {
    VariableDefinitionImpl variableDefinition = new VariableDefinitionImpl();
    return variableDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDefinition createFunctionDefinition()
  {
    FunctionDefinitionImpl functionDefinition = new FunctionDefinitionImpl();
    return functionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionPackage getFunctionPackage()
  {
    return (FunctionPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FunctionPackage getPackage()
  {
    return FunctionPackage.eINSTANCE;
  }

} //FunctionFactoryImpl
