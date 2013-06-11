/**
 */
package org.xtext.function.function;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.function.function.FunctionFactory
 * @model kind="package"
 * @generated
 */
public interface FunctionPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "function";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/function/Function";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "function";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FunctionPackage eINSTANCE = org.xtext.function.function.impl.FunctionPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.ModelImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.StartImpl <em>Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.StartImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getStart()
   * @generated
   */
  int START = 1;

  /**
   * The number of structural features of the '<em>Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.ExpWithDefinitionsImpl <em>Exp With Definitions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.ExpWithDefinitionsImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getExpWithDefinitions()
   * @generated
   */
  int EXP_WITH_DEFINITIONS = 2;

  /**
   * The number of structural features of the '<em>Exp With Definitions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_WITH_DEFINITIONS_FEATURE_COUNT = START_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.ExpImpl <em>Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.ExpImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getExp()
   * @generated
   */
  int EXP = 3;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__VARIABLE = EXP_WITH_DEFINITIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__VALUE = EXP_WITH_DEFINITIONS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Functioncall</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__FUNCTIONCALL = EXP_WITH_DEFINITIONS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__LEFT = EXP_WITH_DEFINITIONS_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_FEATURE_COUNT = EXP_WITH_DEFINITIONS_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.ExpressionImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 4;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__VARIABLE = EXP__VARIABLE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__VALUE = EXP__VALUE;

  /**
   * The feature id for the '<em><b>Functioncall</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__FUNCTIONCALL = EXP__FUNCTIONCALL;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = EXP__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OP = EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = EXP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = EXP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.TerminalExpressionImpl <em>Terminal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.TerminalExpressionImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getTerminalExpression()
   * @generated
   */
  int TERMINAL_EXPRESSION = 5;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION__VALUE = 1;

  /**
   * The feature id for the '<em><b>Functioncall</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION__FUNCTIONCALL = 2;

  /**
   * The number of structural features of the '<em>Terminal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.MathFunctionImpl <em>Math Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.MathFunctionImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getMathFunction()
   * @generated
   */
  int MATH_FUNCTION = 6;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_FUNCTION__VARIABLE = EXP__VARIABLE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_FUNCTION__VALUE = EXP__VALUE;

  /**
   * The feature id for the '<em><b>Functioncall</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_FUNCTION__FUNCTIONCALL = EXP__FUNCTIONCALL;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_FUNCTION__LEFT = EXP__LEFT;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_FUNCTION__FUNCTION = EXP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Math Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_FUNCTION_FEATURE_COUNT = EXP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.MathTwoArgImpl <em>Math Two Arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.MathTwoArgImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getMathTwoArg()
   * @generated
   */
  int MATH_TWO_ARG = 7;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_TWO_ARG__VARIABLE = MATH_FUNCTION__VARIABLE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_TWO_ARG__VALUE = MATH_FUNCTION__VALUE;

  /**
   * The feature id for the '<em><b>Functioncall</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_TWO_ARG__FUNCTIONCALL = MATH_FUNCTION__FUNCTIONCALL;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_TWO_ARG__LEFT = MATH_FUNCTION__LEFT;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_TWO_ARG__FUNCTION = MATH_FUNCTION__FUNCTION;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_TWO_ARG__RIGHT = MATH_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Math Two Arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_TWO_ARG_FEATURE_COUNT = MATH_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.MathOneArgImpl <em>Math One Arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.MathOneArgImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getMathOneArg()
   * @generated
   */
  int MATH_ONE_ARG = 8;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_ONE_ARG__VARIABLE = MATH_FUNCTION__VARIABLE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_ONE_ARG__VALUE = MATH_FUNCTION__VALUE;

  /**
   * The feature id for the '<em><b>Functioncall</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_ONE_ARG__FUNCTIONCALL = MATH_FUNCTION__FUNCTIONCALL;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_ONE_ARG__LEFT = MATH_FUNCTION__LEFT;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_ONE_ARG__FUNCTION = MATH_FUNCTION__FUNCTION;

  /**
   * The number of structural features of the '<em>Math One Arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_ONE_ARG_FEATURE_COUNT = MATH_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.VariableDefinitionImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getVariableDefinition()
   * @generated
   */
  int VARIABLE_DEFINITION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__NAME = EXP_WITH_DEFINITIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__NUMBER = EXP_WITH_DEFINITIONS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_FEATURE_COUNT = EXP_WITH_DEFINITIONS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.FunctionDefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.FunctionDefinitionImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getFunctionDefinition()
   * @generated
   */
  int FUNCTION_DEFINITION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__NAME = EXP_WITH_DEFINITIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__PARAMETERS = EXP_WITH_DEFINITIONS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__EXP = EXP_WITH_DEFINITIONS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION_FEATURE_COUNT = EXP_WITH_DEFINITIONS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.ParameterImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.FunctionCallImpl <em>Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.FunctionCallImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getFunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 12;

  /**
   * The feature id for the '<em><b>Func</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__FUNC = START_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Paramvalues</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__PARAMVALUES = START_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = START_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.ParamValuesImpl <em>Param Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.ParamValuesImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getParamValues()
   * @generated
   */
  int PARAM_VALUES = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_VALUES__VALUE = 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_VALUES__VARIABLE = 1;

  /**
   * The number of structural features of the '<em>Param Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_VALUES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.TerminalExpressionInFunImpl <em>Terminal Expression In Fun</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.TerminalExpressionInFunImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getTerminalExpressionInFun()
   * @generated
   */
  int TERMINAL_EXPRESSION_IN_FUN = 16;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION_IN_FUN__VALUE = 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION_IN_FUN__PARAMETER = 1;

  /**
   * The number of structural features of the '<em>Terminal Expression In Fun</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION_IN_FUN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.ExpInFunImpl <em>Exp In Fun</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.ExpInFunImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getExpInFun()
   * @generated
   */
  int EXP_IN_FUN = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_IN_FUN__VALUE = TERMINAL_EXPRESSION_IN_FUN__VALUE;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_IN_FUN__PARAMETER = TERMINAL_EXPRESSION_IN_FUN__PARAMETER;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_IN_FUN__LEFT = TERMINAL_EXPRESSION_IN_FUN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Exp In Fun</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_IN_FUN_FEATURE_COUNT = TERMINAL_EXPRESSION_IN_FUN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.ExpressionInFunImpl <em>Expression In Fun</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.ExpressionInFunImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getExpressionInFun()
   * @generated
   */
  int EXPRESSION_IN_FUN = 15;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_IN_FUN__VALUE = EXP_IN_FUN__VALUE;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_IN_FUN__PARAMETER = EXP_IN_FUN__PARAMETER;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_IN_FUN__LEFT = EXP_IN_FUN__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_IN_FUN__OP = EXP_IN_FUN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_IN_FUN__RIGHT = EXP_IN_FUN_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression In Fun</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_IN_FUN_FEATURE_COUNT = EXP_IN_FUN_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.MathFunctionInFunImpl <em>Math Function In Fun</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.MathFunctionInFunImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getMathFunctionInFun()
   * @generated
   */
  int MATH_FUNCTION_IN_FUN = 17;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_FUNCTION_IN_FUN__VALUE = EXP_IN_FUN__VALUE;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_FUNCTION_IN_FUN__PARAMETER = EXP_IN_FUN__PARAMETER;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_FUNCTION_IN_FUN__LEFT = EXP_IN_FUN__LEFT;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_FUNCTION_IN_FUN__FUNCTION = EXP_IN_FUN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Math Function In Fun</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_FUNCTION_IN_FUN_FEATURE_COUNT = EXP_IN_FUN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.MathTwoArgInFunImpl <em>Math Two Arg In Fun</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.MathTwoArgInFunImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getMathTwoArgInFun()
   * @generated
   */
  int MATH_TWO_ARG_IN_FUN = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_TWO_ARG_IN_FUN__VALUE = MATH_FUNCTION_IN_FUN__VALUE;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_TWO_ARG_IN_FUN__PARAMETER = MATH_FUNCTION_IN_FUN__PARAMETER;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_TWO_ARG_IN_FUN__LEFT = MATH_FUNCTION_IN_FUN__LEFT;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_TWO_ARG_IN_FUN__FUNCTION = MATH_FUNCTION_IN_FUN__FUNCTION;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_TWO_ARG_IN_FUN__RIGHT = MATH_FUNCTION_IN_FUN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Math Two Arg In Fun</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_TWO_ARG_IN_FUN_FEATURE_COUNT = MATH_FUNCTION_IN_FUN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.MathOneArgInFunImpl <em>Math One Arg In Fun</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.MathOneArgInFunImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getMathOneArgInFun()
   * @generated
   */
  int MATH_ONE_ARG_IN_FUN = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_ONE_ARG_IN_FUN__VALUE = MATH_FUNCTION_IN_FUN__VALUE;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_ONE_ARG_IN_FUN__PARAMETER = MATH_FUNCTION_IN_FUN__PARAMETER;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_ONE_ARG_IN_FUN__LEFT = MATH_FUNCTION_IN_FUN__LEFT;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_ONE_ARG_IN_FUN__FUNCTION = MATH_FUNCTION_IN_FUN__FUNCTION;

  /**
   * The number of structural features of the '<em>Math One Arg In Fun</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_ONE_ARG_IN_FUN_FEATURE_COUNT = MATH_FUNCTION_IN_FUN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.function.function.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.function.function.impl.IfStatementImpl
   * @see org.xtext.function.function.impl.FunctionPackageImpl#getIfStatement()
   * @generated
   */
  int IF_STATEMENT = 20;

  /**
   * The feature id for the '<em><b>Iftype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__IFTYPE = START_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__LEFT = START_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__RIGHT = START_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Whentrue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__WHENTRUE = START_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Whenfalse</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__WHENFALSE = START_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = START_FEATURE_COUNT + 5;


  /**
   * Returns the meta object for class '{@link org.xtext.function.function.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.function.function.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.function.function.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.function.function.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.function.function.Start <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start</em>'.
   * @see org.xtext.function.function.Start
   * @generated
   */
  EClass getStart();

  /**
   * Returns the meta object for class '{@link org.xtext.function.function.ExpWithDefinitions <em>Exp With Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp With Definitions</em>'.
   * @see org.xtext.function.function.ExpWithDefinitions
   * @generated
   */
  EClass getExpWithDefinitions();

  /**
   * Returns the meta object for class '{@link org.xtext.function.function.Exp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp</em>'.
   * @see org.xtext.function.function.Exp
   * @generated
   */
  EClass getExp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.function.function.Exp#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.function.function.Exp#getLeft()
   * @see #getExp()
   * @generated
   */
  EReference getExp_Left();

  /**
   * Returns the meta object for class '{@link org.xtext.function.function.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.function.function.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.function.function.Expression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.function.function.Expression#getOp()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Op();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.function.function.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Right</em>'.
   * @see org.xtext.function.function.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.function.function.TerminalExpression <em>Terminal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terminal Expression</em>'.
   * @see org.xtext.function.function.TerminalExpression
   * @generated
   */
  EClass getTerminalExpression();

  /**
   * Returns the meta object for the reference '{@link org.xtext.function.function.TerminalExpression#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see org.xtext.function.function.TerminalExpression#getVariable()
   * @see #getTerminalExpression()
   * @generated
   */
  EReference getTerminalExpression_Variable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.function.function.TerminalExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.function.function.TerminalExpression#getValue()
   * @see #getTerminalExpression()
   * @generated
   */
  EAttribute getTerminalExpression_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.function.function.TerminalExpression#getFunctioncall <em>Functioncall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Functioncall</em>'.
   * @see org.xtext.function.function.TerminalExpression#getFunctioncall()
   * @see #getTerminalExpression()
   * @generated
   */
  EReference getTerminalExpression_Functioncall();

  /**
   * Returns the meta object for class '{@link org.xtext.function.function.MathFunction <em>Math Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Math Function</em>'.
   * @see org.xtext.function.function.MathFunction
   * @generated
   */
  EClass getMathFunction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.function.function.MathFunction#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see org.xtext.function.function.MathFunction#getFunction()
   * @see #getMathFunction()
   * @generated
   */
  EAttribute getMathFunction_Function();

  /**
   * Returns the meta object for class '{@link org.xtext.function.function.MathTwoArg <em>Math Two Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Math Two Arg</em>'.
   * @see org.xtext.function.function.MathTwoArg
   * @generated
   */
  EClass getMathTwoArg();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.function.function.MathTwoArg#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.function.function.MathTwoArg#getRight()
   * @see #getMathTwoArg()
   * @generated
   */
  EReference getMathTwoArg_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.function.function.MathOneArg <em>Math One Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Math One Arg</em>'.
   * @see org.xtext.function.function.MathOneArg
   * @generated
   */
  EClass getMathOneArg();

  /**
   * Returns the meta object for class '{@link org.xtext.function.function.VariableDefinition <em>Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Definition</em>'.
   * @see org.xtext.function.function.VariableDefinition
   * @generated
   */
  EClass getVariableDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.function.function.VariableDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.function.function.VariableDefinition#getName()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.function.function.VariableDefinition#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see org.xtext.function.function.VariableDefinition#getNumber()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_Number();

  /**
   * Returns the meta object for class '{@link org.xtext.function.function.FunctionDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see org.xtext.function.function.FunctionDefinition
   * @generated
   */
  EClass getFunctionDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.function.function.FunctionDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.function.function.FunctionDefinition#getName()
   * @see #getFunctionDefinition()
   * @generated
   */
  EAttribute getFunctionDefinition_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.function.function.FunctionDefinition#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.function.function.FunctionDefinition#getParameters()
   * @see #getFunctionDefinition()
   * @generated
   */
  EReference getFunctionDefinition_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.function.function.FunctionDefinition#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.function.function.FunctionDefinition#getExp()
   * @see #getFunctionDefinition()
   * @generated
   */
  EReference getFunctionDefinition_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.function.function.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.xtext.function.function.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.function.function.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.function.function.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.function.function.FunctionCall <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call</em>'.
   * @see org.xtext.function.function.FunctionCall
   * @generated
   */
  EClass getFunctionCall();

  /**
   * Returns the meta object for the reference '{@link org.xtext.function.function.FunctionCall#getFunc <em>Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Func</em>'.
   * @see org.xtext.function.function.FunctionCall#getFunc()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Func();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.function.function.FunctionCall#getParamvalues <em>Paramvalues</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Paramvalues</em>'.
   * @see org.xtext.function.function.FunctionCall#getParamvalues()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Paramvalues();

  /**
   * Returns the meta object for class '{@link org.xtext.function.function.ParamValues <em>Param Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Values</em>'.
   * @see org.xtext.function.function.ParamValues
   * @generated
   */
  EClass getParamValues();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.function.function.ParamValues#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.function.function.ParamValues#getValue()
   * @see #getParamValues()
   * @generated
   */
  EAttribute getParamValues_Value();

  /**
   * Returns the meta object for the reference '{@link org.xtext.function.function.ParamValues#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see org.xtext.function.function.ParamValues#getVariable()
   * @see #getParamValues()
   * @generated
   */
  EReference getParamValues_Variable();

  /**
   * Returns the meta object for class '{@link org.xtext.function.function.ExpInFun <em>Exp In Fun</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp In Fun</em>'.
   * @see org.xtext.function.function.ExpInFun
   * @generated
   */
  EClass getExpInFun();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.function.function.ExpInFun#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.function.function.ExpInFun#getLeft()
   * @see #getExpInFun()
   * @generated
   */
  EReference getExpInFun_Left();

  /**
   * Returns the meta object for class '{@link org.xtext.function.function.ExpressionInFun <em>Expression In Fun</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression In Fun</em>'.
   * @see org.xtext.function.function.ExpressionInFun
   * @generated
   */
  EClass getExpressionInFun();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.function.function.ExpressionInFun#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.function.function.ExpressionInFun#getOp()
   * @see #getExpressionInFun()
   * @generated
   */
  EAttribute getExpressionInFun_Op();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.function.function.ExpressionInFun#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Right</em>'.
   * @see org.xtext.function.function.ExpressionInFun#getRight()
   * @see #getExpressionInFun()
   * @generated
   */
  EReference getExpressionInFun_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.function.function.TerminalExpressionInFun <em>Terminal Expression In Fun</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terminal Expression In Fun</em>'.
   * @see org.xtext.function.function.TerminalExpressionInFun
   * @generated
   */
  EClass getTerminalExpressionInFun();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.function.function.TerminalExpressionInFun#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.function.function.TerminalExpressionInFun#getValue()
   * @see #getTerminalExpressionInFun()
   * @generated
   */
  EAttribute getTerminalExpressionInFun_Value();

  /**
   * Returns the meta object for the reference '{@link org.xtext.function.function.TerminalExpressionInFun#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see org.xtext.function.function.TerminalExpressionInFun#getParameter()
   * @see #getTerminalExpressionInFun()
   * @generated
   */
  EReference getTerminalExpressionInFun_Parameter();

  /**
   * Returns the meta object for class '{@link org.xtext.function.function.MathFunctionInFun <em>Math Function In Fun</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Math Function In Fun</em>'.
   * @see org.xtext.function.function.MathFunctionInFun
   * @generated
   */
  EClass getMathFunctionInFun();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.function.function.MathFunctionInFun#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see org.xtext.function.function.MathFunctionInFun#getFunction()
   * @see #getMathFunctionInFun()
   * @generated
   */
  EAttribute getMathFunctionInFun_Function();

  /**
   * Returns the meta object for class '{@link org.xtext.function.function.MathTwoArgInFun <em>Math Two Arg In Fun</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Math Two Arg In Fun</em>'.
   * @see org.xtext.function.function.MathTwoArgInFun
   * @generated
   */
  EClass getMathTwoArgInFun();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.function.function.MathTwoArgInFun#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.function.function.MathTwoArgInFun#getRight()
   * @see #getMathTwoArgInFun()
   * @generated
   */
  EReference getMathTwoArgInFun_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.function.function.MathOneArgInFun <em>Math One Arg In Fun</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Math One Arg In Fun</em>'.
   * @see org.xtext.function.function.MathOneArgInFun
   * @generated
   */
  EClass getMathOneArgInFun();

  /**
   * Returns the meta object for class '{@link org.xtext.function.function.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement</em>'.
   * @see org.xtext.function.function.IfStatement
   * @generated
   */
  EClass getIfStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.function.function.IfStatement#getIftype <em>Iftype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Iftype</em>'.
   * @see org.xtext.function.function.IfStatement#getIftype()
   * @see #getIfStatement()
   * @generated
   */
  EAttribute getIfStatement_Iftype();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.function.function.IfStatement#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.function.function.IfStatement#getLeft()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.function.function.IfStatement#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.function.function.IfStatement#getRight()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Right();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.function.function.IfStatement#getWhentrue <em>Whentrue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Whentrue</em>'.
   * @see org.xtext.function.function.IfStatement#getWhentrue()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Whentrue();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.function.function.IfStatement#getWhenfalse <em>Whenfalse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Whenfalse</em>'.
   * @see org.xtext.function.function.IfStatement#getWhenfalse()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Whenfalse();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FunctionFactory getFunctionFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.ModelImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.StartImpl <em>Start</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.StartImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getStart()
     * @generated
     */
    EClass START = eINSTANCE.getStart();

    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.ExpWithDefinitionsImpl <em>Exp With Definitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.ExpWithDefinitionsImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getExpWithDefinitions()
     * @generated
     */
    EClass EXP_WITH_DEFINITIONS = eINSTANCE.getExpWithDefinitions();

    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.ExpImpl <em>Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.ExpImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getExp()
     * @generated
     */
    EClass EXP = eINSTANCE.getExp();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__LEFT = eINSTANCE.getExp_Left();

    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.ExpressionImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__OP = eINSTANCE.getExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.TerminalExpressionImpl <em>Terminal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.TerminalExpressionImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getTerminalExpression()
     * @generated
     */
    EClass TERMINAL_EXPRESSION = eINSTANCE.getTerminalExpression();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINAL_EXPRESSION__VARIABLE = eINSTANCE.getTerminalExpression_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERMINAL_EXPRESSION__VALUE = eINSTANCE.getTerminalExpression_Value();

    /**
     * The meta object literal for the '<em><b>Functioncall</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINAL_EXPRESSION__FUNCTIONCALL = eINSTANCE.getTerminalExpression_Functioncall();

    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.MathFunctionImpl <em>Math Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.MathFunctionImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getMathFunction()
     * @generated
     */
    EClass MATH_FUNCTION = eINSTANCE.getMathFunction();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATH_FUNCTION__FUNCTION = eINSTANCE.getMathFunction_Function();

    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.MathTwoArgImpl <em>Math Two Arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.MathTwoArgImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getMathTwoArg()
     * @generated
     */
    EClass MATH_TWO_ARG = eINSTANCE.getMathTwoArg();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATH_TWO_ARG__RIGHT = eINSTANCE.getMathTwoArg_Right();

    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.MathOneArgImpl <em>Math One Arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.MathOneArgImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getMathOneArg()
     * @generated
     */
    EClass MATH_ONE_ARG = eINSTANCE.getMathOneArg();

    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.VariableDefinitionImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getVariableDefinition()
     * @generated
     */
    EClass VARIABLE_DEFINITION = eINSTANCE.getVariableDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__NAME = eINSTANCE.getVariableDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__NUMBER = eINSTANCE.getVariableDefinition_Number();

    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.FunctionDefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.FunctionDefinitionImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getFunctionDefinition()
     * @generated
     */
    EClass FUNCTION_DEFINITION = eINSTANCE.getFunctionDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DEFINITION__NAME = eINSTANCE.getFunctionDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEFINITION__PARAMETERS = eINSTANCE.getFunctionDefinition_Parameters();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEFINITION__EXP = eINSTANCE.getFunctionDefinition_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.ParameterImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.FunctionCallImpl <em>Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.FunctionCallImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getFunctionCall()
     * @generated
     */
    EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

    /**
     * The meta object literal for the '<em><b>Func</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__FUNC = eINSTANCE.getFunctionCall_Func();

    /**
     * The meta object literal for the '<em><b>Paramvalues</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__PARAMVALUES = eINSTANCE.getFunctionCall_Paramvalues();

    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.ParamValuesImpl <em>Param Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.ParamValuesImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getParamValues()
     * @generated
     */
    EClass PARAM_VALUES = eINSTANCE.getParamValues();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_VALUES__VALUE = eINSTANCE.getParamValues_Value();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM_VALUES__VARIABLE = eINSTANCE.getParamValues_Variable();

    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.ExpInFunImpl <em>Exp In Fun</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.ExpInFunImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getExpInFun()
     * @generated
     */
    EClass EXP_IN_FUN = eINSTANCE.getExpInFun();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP_IN_FUN__LEFT = eINSTANCE.getExpInFun_Left();

    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.ExpressionInFunImpl <em>Expression In Fun</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.ExpressionInFunImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getExpressionInFun()
     * @generated
     */
    EClass EXPRESSION_IN_FUN = eINSTANCE.getExpressionInFun();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_IN_FUN__OP = eINSTANCE.getExpressionInFun_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_IN_FUN__RIGHT = eINSTANCE.getExpressionInFun_Right();

    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.TerminalExpressionInFunImpl <em>Terminal Expression In Fun</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.TerminalExpressionInFunImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getTerminalExpressionInFun()
     * @generated
     */
    EClass TERMINAL_EXPRESSION_IN_FUN = eINSTANCE.getTerminalExpressionInFun();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERMINAL_EXPRESSION_IN_FUN__VALUE = eINSTANCE.getTerminalExpressionInFun_Value();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINAL_EXPRESSION_IN_FUN__PARAMETER = eINSTANCE.getTerminalExpressionInFun_Parameter();

    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.MathFunctionInFunImpl <em>Math Function In Fun</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.MathFunctionInFunImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getMathFunctionInFun()
     * @generated
     */
    EClass MATH_FUNCTION_IN_FUN = eINSTANCE.getMathFunctionInFun();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATH_FUNCTION_IN_FUN__FUNCTION = eINSTANCE.getMathFunctionInFun_Function();

    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.MathTwoArgInFunImpl <em>Math Two Arg In Fun</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.MathTwoArgInFunImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getMathTwoArgInFun()
     * @generated
     */
    EClass MATH_TWO_ARG_IN_FUN = eINSTANCE.getMathTwoArgInFun();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATH_TWO_ARG_IN_FUN__RIGHT = eINSTANCE.getMathTwoArgInFun_Right();

    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.MathOneArgInFunImpl <em>Math One Arg In Fun</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.MathOneArgInFunImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getMathOneArgInFun()
     * @generated
     */
    EClass MATH_ONE_ARG_IN_FUN = eINSTANCE.getMathOneArgInFun();

    /**
     * The meta object literal for the '{@link org.xtext.function.function.impl.IfStatementImpl <em>If Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.function.function.impl.IfStatementImpl
     * @see org.xtext.function.function.impl.FunctionPackageImpl#getIfStatement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getIfStatement();

    /**
     * The meta object literal for the '<em><b>Iftype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_STATEMENT__IFTYPE = eINSTANCE.getIfStatement_Iftype();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__LEFT = eINSTANCE.getIfStatement_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__RIGHT = eINSTANCE.getIfStatement_Right();

    /**
     * The meta object literal for the '<em><b>Whentrue</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__WHENTRUE = eINSTANCE.getIfStatement_Whentrue();

    /**
     * The meta object literal for the '<em><b>Whenfalse</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__WHENFALSE = eINSTANCE.getIfStatement_Whenfalse();

  }

} //FunctionPackage
