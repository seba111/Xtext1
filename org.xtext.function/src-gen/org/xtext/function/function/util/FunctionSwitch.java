/**
 */
package org.xtext.function.function.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.function.function.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.function.function.FunctionPackage
 * @generated
 */
public class FunctionSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FunctionPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FunctionPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case FunctionPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FunctionPackage.START:
      {
        Start start = (Start)theEObject;
        T result = caseStart(start);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FunctionPackage.EXP_WITH_DEFINITIONS:
      {
        ExpWithDefinitions expWithDefinitions = (ExpWithDefinitions)theEObject;
        T result = caseExpWithDefinitions(expWithDefinitions);
        if (result == null) result = caseStart(expWithDefinitions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FunctionPackage.EXP:
      {
        Exp exp = (Exp)theEObject;
        T result = caseExp(exp);
        if (result == null) result = caseExpWithDefinitions(exp);
        if (result == null) result = caseTerminalExpression(exp);
        if (result == null) result = caseStart(exp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FunctionPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseExp(expression);
        if (result == null) result = caseExpWithDefinitions(expression);
        if (result == null) result = caseTerminalExpression(expression);
        if (result == null) result = caseStart(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FunctionPackage.TERMINAL_EXPRESSION:
      {
        TerminalExpression terminalExpression = (TerminalExpression)theEObject;
        T result = caseTerminalExpression(terminalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FunctionPackage.MATH_FUNCTION:
      {
        MathFunction mathFunction = (MathFunction)theEObject;
        T result = caseMathFunction(mathFunction);
        if (result == null) result = caseExp(mathFunction);
        if (result == null) result = caseExpWithDefinitions(mathFunction);
        if (result == null) result = caseTerminalExpression(mathFunction);
        if (result == null) result = caseStart(mathFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FunctionPackage.MATH_TWO_ARG:
      {
        MathTwoArg mathTwoArg = (MathTwoArg)theEObject;
        T result = caseMathTwoArg(mathTwoArg);
        if (result == null) result = caseMathFunction(mathTwoArg);
        if (result == null) result = caseExp(mathTwoArg);
        if (result == null) result = caseExpWithDefinitions(mathTwoArg);
        if (result == null) result = caseTerminalExpression(mathTwoArg);
        if (result == null) result = caseStart(mathTwoArg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FunctionPackage.MATH_ONE_ARG:
      {
        MathOneArg mathOneArg = (MathOneArg)theEObject;
        T result = caseMathOneArg(mathOneArg);
        if (result == null) result = caseMathFunction(mathOneArg);
        if (result == null) result = caseExp(mathOneArg);
        if (result == null) result = caseExpWithDefinitions(mathOneArg);
        if (result == null) result = caseTerminalExpression(mathOneArg);
        if (result == null) result = caseStart(mathOneArg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FunctionPackage.VARIABLE_DEFINITION:
      {
        VariableDefinition variableDefinition = (VariableDefinition)theEObject;
        T result = caseVariableDefinition(variableDefinition);
        if (result == null) result = caseExpWithDefinitions(variableDefinition);
        if (result == null) result = caseStart(variableDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FunctionPackage.FUNCTION_DEFINITION:
      {
        FunctionDefinition functionDefinition = (FunctionDefinition)theEObject;
        T result = caseFunctionDefinition(functionDefinition);
        if (result == null) result = caseExpWithDefinitions(functionDefinition);
        if (result == null) result = caseStart(functionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FunctionPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FunctionPackage.FUNCTION_CALL:
      {
        FunctionCall functionCall = (FunctionCall)theEObject;
        T result = caseFunctionCall(functionCall);
        if (result == null) result = caseStart(functionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FunctionPackage.PARAM_VALUES:
      {
        ParamValues paramValues = (ParamValues)theEObject;
        T result = caseParamValues(paramValues);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FunctionPackage.EXP_IN_FUN:
      {
        ExpInFun expInFun = (ExpInFun)theEObject;
        T result = caseExpInFun(expInFun);
        if (result == null) result = caseTerminalExpressionInFun(expInFun);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FunctionPackage.EXPRESSION_IN_FUN:
      {
        ExpressionInFun expressionInFun = (ExpressionInFun)theEObject;
        T result = caseExpressionInFun(expressionInFun);
        if (result == null) result = caseExpInFun(expressionInFun);
        if (result == null) result = caseTerminalExpressionInFun(expressionInFun);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FunctionPackage.TERMINAL_EXPRESSION_IN_FUN:
      {
        TerminalExpressionInFun terminalExpressionInFun = (TerminalExpressionInFun)theEObject;
        T result = caseTerminalExpressionInFun(terminalExpressionInFun);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FunctionPackage.MATH_FUNCTION_IN_FUN:
      {
        MathFunctionInFun mathFunctionInFun = (MathFunctionInFun)theEObject;
        T result = caseMathFunctionInFun(mathFunctionInFun);
        if (result == null) result = caseExpInFun(mathFunctionInFun);
        if (result == null) result = caseTerminalExpressionInFun(mathFunctionInFun);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FunctionPackage.MATH_TWO_ARG_IN_FUN:
      {
        MathTwoArgInFun mathTwoArgInFun = (MathTwoArgInFun)theEObject;
        T result = caseMathTwoArgInFun(mathTwoArgInFun);
        if (result == null) result = caseMathFunctionInFun(mathTwoArgInFun);
        if (result == null) result = caseExpInFun(mathTwoArgInFun);
        if (result == null) result = caseTerminalExpressionInFun(mathTwoArgInFun);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FunctionPackage.MATH_ONE_ARG_IN_FUN:
      {
        MathOneArgInFun mathOneArgInFun = (MathOneArgInFun)theEObject;
        T result = caseMathOneArgInFun(mathOneArgInFun);
        if (result == null) result = caseMathFunctionInFun(mathOneArgInFun);
        if (result == null) result = caseExpInFun(mathOneArgInFun);
        if (result == null) result = caseTerminalExpressionInFun(mathOneArgInFun);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FunctionPackage.IF_STATEMENT:
      {
        IfStatement ifStatement = (IfStatement)theEObject;
        T result = caseIfStatement(ifStatement);
        if (result == null) result = caseStart(ifStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Start</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStart(Start object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp With Definitions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp With Definitions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpWithDefinitions(ExpWithDefinitions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExp(Exp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terminal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terminal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerminalExpression(TerminalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Math Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Math Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMathFunction(MathFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Math Two Arg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Math Two Arg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMathTwoArg(MathTwoArg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Math One Arg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Math One Arg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMathOneArg(MathOneArg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDefinition(VariableDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionDefinition(FunctionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionCall(FunctionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param Values</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param Values</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParamValues(ParamValues object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp In Fun</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp In Fun</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpInFun(ExpInFun object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression In Fun</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression In Fun</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionInFun(ExpressionInFun object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terminal Expression In Fun</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terminal Expression In Fun</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerminalExpressionInFun(TerminalExpressionInFun object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Math Function In Fun</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Math Function In Fun</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMathFunctionInFun(MathFunctionInFun object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Math Two Arg In Fun</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Math Two Arg In Fun</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMathTwoArgInFun(MathTwoArgInFun object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Math One Arg In Fun</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Math One Arg In Fun</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMathOneArgInFun(MathOneArgInFun object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfStatement(IfStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //FunctionSwitch
