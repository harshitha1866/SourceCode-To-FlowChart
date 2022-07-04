import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.HashMap;
import java.util.ArrayList;
public class PrintEverything implements XListener {
	public static ArrayList<String> map = new ArrayList<String>(); 
	public void enterPrimaryExpression(XParser.PrimaryExpressionContext ctx){}

	public void exitPrimaryExpression(XParser.PrimaryExpressionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	public void enterGenericSelection(XParser.GenericSelectionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	public void exitGenericSelection(XParser.GenericSelectionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	public void enterGenericAssocList(XParser.GenericAssocListContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	public void exitGenericAssocList(XParser.GenericAssocListContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	public void enterGenericAssociation(XParser.GenericAssociationContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	public void exitGenericAssociation(XParser.GenericAssociationContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	public void enterPostfixExpression(XParser.PostfixExpressionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	public void exitPostfixExpression(XParser.PostfixExpressionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	public void enterArgumentExpressionList(XParser.ArgumentExpressionListContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	public void exitArgumentExpressionList(XParser.ArgumentExpressionListContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	public void enterUnaryExpression(XParser.UnaryExpressionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	public void exitUnaryExpression(XParser.UnaryExpressionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	public void enterUnaryOperator(XParser.UnaryOperatorContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	public void exitUnaryOperator(XParser.UnaryOperatorContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#castExpression}.
	 * @param ctx the parse tree
	 */
	public void enterCastExpression(XParser.CastExpressionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#castExpression}.
	 * @param ctx the parse tree
	 */
	public void exitCastExpression(XParser.CastExpressionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	public void enterMultiplicativeExpression(XParser.MultiplicativeExpressionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	public void exitMultiplicativeExpression(XParser.MultiplicativeExpressionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	public void enterAdditiveExpression(XParser.AdditiveExpressionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	public void exitAdditiveExpression(XParser.AdditiveExpressionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	public void enterShiftExpression(XParser.ShiftExpressionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	public void exitShiftExpression(XParser.ShiftExpressionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	public void enterRelationalExpression(XParser.RelationalExpressionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	public void exitRelationalExpression(XParser.RelationalExpressionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	public void enterEqualityExpression(XParser.EqualityExpressionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	public void exitEqualityExpression(XParser.EqualityExpressionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#andExpression}.
	 * @param ctx the parse tree
	 */
	public void enterAndExpression(XParser.AndExpressionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#andExpression}.
	 * @param ctx the parse tree
	 */
	public void exitAndExpression(XParser.AndExpressionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	public void enterExclusiveOrExpression(XParser.ExclusiveOrExpressionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	public void exitExclusiveOrExpression(XParser.ExclusiveOrExpressionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	public void enterInclusiveOrExpression(XParser.InclusiveOrExpressionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	public void exitInclusiveOrExpression(XParser.InclusiveOrExpressionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	public void enterLogicalAndExpression(XParser.LogicalAndExpressionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	public void exitLogicalAndExpression(XParser.LogicalAndExpressionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	public void enterLogicalOrExpression(XParser.LogicalOrExpressionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	public void exitLogicalOrExpression(XParser.LogicalOrExpressionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	public void enterConditionalExpression(XParser.ConditionalExpressionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	public void exitConditionalExpression(XParser.ConditionalExpressionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	public void enterAssignmentExpression(XParser.AssignmentExpressionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	public void exitAssignmentExpression(XParser.AssignmentExpressionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	public void enterAssignmentOperator(XParser.AssignmentOperatorContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	public void exitAssignmentOperator(XParser.AssignmentOperatorContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#expression}.
	 * @param ctx the parse tree
	 */
	public void enterExpression(XParser.ExpressionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#expression}.
	 * @param ctx the parse tree
	 */
	public void exitExpression(XParser.ExpressionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	public void enterConstantExpression(XParser.ConstantExpressionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	public void exitConstantExpression(XParser.ConstantExpressionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#declaration}.
	 * @param ctx the parse tree
	 */
	public void enterDeclaration(XParser.DeclarationContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#declaration}.
	 * @param ctx the parse tree
	 */
	public void exitDeclaration(XParser.DeclarationContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	public void enterDeclarationSpecifiers(XParser.DeclarationSpecifiersContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	public void exitDeclarationSpecifiers(XParser.DeclarationSpecifiersContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	public void enterDeclarationSpecifiers2(XParser.DeclarationSpecifiers2Context ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	public void exitDeclarationSpecifiers2(XParser.DeclarationSpecifiers2Context ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	public void enterDeclarationSpecifier(XParser.DeclarationSpecifierContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	public void exitDeclarationSpecifier(XParser.DeclarationSpecifierContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	public void enterInitDeclaratorList(XParser.InitDeclaratorListContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	public void exitInitDeclaratorList(XParser.InitDeclaratorListContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	public void enterInitDeclarator(XParser.InitDeclaratorContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	public void exitInitDeclarator(XParser.InitDeclaratorContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	public void enterStorageClassSpecifier(XParser.StorageClassSpecifierContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	public void exitStorageClassSpecifier(XParser.StorageClassSpecifierContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	public void enterTypeSpecifier(XParser.TypeSpecifierContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	public void exitTypeSpecifier(XParser.TypeSpecifierContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	public void enterStructOrUnionSpecifier(XParser.StructOrUnionSpecifierContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	public void exitStructOrUnionSpecifier(XParser.StructOrUnionSpecifierContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	public void enterStructOrUnion(XParser.StructOrUnionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	public void exitStructOrUnion(XParser.StructOrUnionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	public void enterStructDeclarationList(XParser.StructDeclarationListContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	public void exitStructDeclarationList(XParser.StructDeclarationListContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterStructDeclaration(XParser.StructDeclarationContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitStructDeclaration(XParser.StructDeclarationContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	public void enterSpecifierQualifierList(XParser.SpecifierQualifierListContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	public void exitSpecifierQualifierList(XParser.SpecifierQualifierListContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	public void enterStructDeclaratorList(XParser.StructDeclaratorListContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	public void exitStructDeclaratorList(XParser.StructDeclaratorListContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	public void enterStructDeclarator(XParser.StructDeclaratorContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	public void exitStructDeclarator(XParser.StructDeclaratorContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	public void enterEnumSpecifier(XParser.EnumSpecifierContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	public void exitEnumSpecifier(XParser.EnumSpecifierContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	public void enterEnumeratorList(XParser.EnumeratorListContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	public void exitEnumeratorList(XParser.EnumeratorListContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#enumerator}.
	 * @param ctx the parse tree
	 */
	public void enterEnumerator(XParser.EnumeratorContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#enumerator}.
	 * @param ctx the parse tree
	 */
	public void exitEnumerator(XParser.EnumeratorContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	public void enterEnumerationConstant(XParser.EnumerationConstantContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	public void exitEnumerationConstant(XParser.EnumerationConstantContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	public void enterAtomicTypeSpecifier(XParser.AtomicTypeSpecifierContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	public void exitAtomicTypeSpecifier(XParser.AtomicTypeSpecifierContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	public void enterTypeQualifier(XParser.TypeQualifierContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	public void exitTypeQualifier(XParser.TypeQualifierContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	public void enterFunctionSpecifier(XParser.FunctionSpecifierContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	public void exitFunctionSpecifier(XParser.FunctionSpecifierContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	public void enterAlignmentSpecifier(XParser.AlignmentSpecifierContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	public void exitAlignmentSpecifier(XParser.AlignmentSpecifierContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#declarator}.
	 * @param ctx the parse tree
	 */
	public void enterDeclarator(XParser.DeclaratorContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#declarator}.
	 * @param ctx the parse tree
	 */
	public void exitDeclarator(XParser.DeclaratorContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	public void enterDirectDeclarator(XParser.DirectDeclaratorContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	public void exitDirectDeclarator(XParser.DirectDeclaratorContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#vcSpecificModifer}.
	 * @param ctx the parse tree
	 */
	public void enterVcSpecificModifer(XParser.VcSpecificModiferContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#vcSpecificModifer}.
	 * @param ctx the parse tree
	 */
	public void exitVcSpecificModifer(XParser.VcSpecificModiferContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	public void enterGccDeclaratorExtension(XParser.GccDeclaratorExtensionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	public void exitGccDeclaratorExtension(XParser.GccDeclaratorExtensionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	public void enterGccAttributeSpecifier(XParser.GccAttributeSpecifierContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	public void exitGccAttributeSpecifier(XParser.GccAttributeSpecifierContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	public void enterGccAttributeList(XParser.GccAttributeListContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	public void exitGccAttributeList(XParser.GccAttributeListContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	public void enterGccAttribute(XParser.GccAttributeContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	public void exitGccAttribute(XParser.GccAttributeContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	public void enterNestedParenthesesBlock(XParser.NestedParenthesesBlockContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	public void exitNestedParenthesesBlock(XParser.NestedParenthesesBlockContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#pointer}.
	 * @param ctx the parse tree
	 */
	public void enterPointer(XParser.PointerContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#pointer}.
	 * @param ctx the parse tree
	 */
	public void exitPointer(XParser.PointerContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	public void enterTypeQualifierList(XParser.TypeQualifierListContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	public void exitTypeQualifierList(XParser.TypeQualifierListContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	public void enterParameterTypeList(XParser.ParameterTypeListContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	public void exitParameterTypeList(XParser.ParameterTypeListContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#parameterList}.
	 * @param ctx the parse tree
	 */
	public void enterParameterList(XParser.ParameterListContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#parameterList}.
	 * @param ctx the parse tree
	 */
	public void exitParameterList(XParser.ParameterListContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterParameterDeclaration(XParser.ParameterDeclarationContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitParameterDeclaration(XParser.ParameterDeclarationContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#identifierList}.
	 * @param ctx the parse tree
	 */
	public void enterIdentifierList(XParser.IdentifierListContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#identifierList}.
	 * @param ctx the parse tree
	 */
	public void exitIdentifierList(XParser.IdentifierListContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#typeName}.
	 * @param ctx the parse tree
	 */
	public void enterTypeName(XParser.TypeNameContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#typeName}.
	 * @param ctx the parse tree
	 */
	public void exitTypeName(XParser.TypeNameContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	public void enterAbstractDeclarator(XParser.AbstractDeclaratorContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	public void exitAbstractDeclarator(XParser.AbstractDeclaratorContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	public void enterDirectAbstractDeclarator(XParser.DirectAbstractDeclaratorContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	public void exitDirectAbstractDeclarator(XParser.DirectAbstractDeclaratorContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#typedefName}.
	 * @param ctx the parse tree
	 */
	public void enterTypedefName(XParser.TypedefNameContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#typedefName}.
	 * @param ctx the parse tree
	 */
	public void exitTypedefName(XParser.TypedefNameContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#initializer}.
	 * @param ctx the parse tree
	 */
	public void enterInitializer(XParser.InitializerContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#initializer}.
	 * @param ctx the parse tree
	 */
	public void exitInitializer(XParser.InitializerContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#initializerList}.
	 * @param ctx the parse tree
	 */
	public void enterInitializerList(XParser.InitializerListContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#initializerList}.
	 * @param ctx the parse tree
	 */
	public void exitInitializerList(XParser.InitializerListContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#designation}.
	 * @param ctx the parse tree
	 */
	public void enterDesignation(XParser.DesignationContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#designation}.
	 * @param ctx the parse tree
	 */
	public void exitDesignation(XParser.DesignationContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#designatorList}.
	 * @param ctx the parse tree
	 */
	public void enterDesignatorList(XParser.DesignatorListContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#designatorList}.
	 * @param ctx the parse tree
	 */
	public void exitDesignatorList(XParser.DesignatorListContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#designator}.
	 * @param ctx the parse tree
	 */
	public void enterDesignator(XParser.DesignatorContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#designator}.
	 * @param ctx the parse tree
	 */
	public void exitDesignator(XParser.DesignatorContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterStaticAssertDeclaration(XParser.StaticAssertDeclarationContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitStaticAssertDeclaration(XParser.StaticAssertDeclarationContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#statement}.
	 * @param ctx the parse tree
	 */
	public void enterStatement(XParser.StatementContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#statement}.
	 * @param ctx the parse tree
	 */
	public void exitStatement(XParser.StatementContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	public void enterLabeledStatement(XParser.LabeledStatementContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	public void exitLabeledStatement(XParser.LabeledStatementContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	public void enterCompoundStatement(XParser.CompoundStatementContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	public void exitCompoundStatement(XParser.CompoundStatementContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	public void enterBlockItemList(XParser.BlockItemListContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	public void exitBlockItemList(XParser.BlockItemListContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#blockItem}.
	 * @param ctx the parse tree
	 */
	public void enterBlockItem(XParser.BlockItemContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#blockItem}.
	 * @param ctx the parse tree
	 */
	public void exitBlockItem(XParser.BlockItemContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	public void enterExpressionStatement(XParser.ExpressionStatementContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	public void exitExpressionStatement(XParser.ExpressionStatementContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	
	public void enterSelectionStatement(XParser.SelectionStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	public void exitSelectionStatement(XParser.SelectionStatementContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	public void enterIterationStatement(XParser.IterationStatementContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	public void exitIterationStatement(XParser.IterationStatementContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#forCondition}.
	 * @param ctx the parse tree
	 */
	public void enterForCondition(XParser.ForConditionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#forCondition}.
	 * @param ctx the parse tree
	 */
	public void exitForCondition(XParser.ForConditionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterForDeclaration(XParser.ForDeclarationContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitForDeclaration(XParser.ForDeclarationContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#forExpression}.
	 * @param ctx the parse tree
	 */
	public void enterForExpression(XParser.ForExpressionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#forExpression}.
	 * @param ctx the parse tree
	 */
	public void exitForExpression(XParser.ForExpressionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	public void enterJumpStatement(XParser.JumpStatementContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	public void exitJumpStatement(XParser.JumpStatementContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	public void enterCompilationUnit(XParser.CompilationUnitContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	public void exitCompilationUnit(XParser.CompilationUnitContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	public void enterTranslationUnit(XParser.TranslationUnitContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	public void exitTranslationUnit(XParser.TranslationUnitContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterExternalDeclaration(XParser.ExternalDeclarationContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitExternalDeclaration(XParser.ExternalDeclarationContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	public void enterFunctionDefinition(XParser.FunctionDefinitionContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	public void exitFunctionDefinition(XParser.FunctionDefinitionContext ctx){}
	/**
	 * Enter a parse tree produced by {@link XParser#declarationList}.
	 * @param ctx the parse tree
	 */
	public void enterDeclarationList(XParser.DeclarationListContext ctx){}
	/**
	 * Exit a parse tree produced by {@link XParser#declarationList}.
	 * @param ctx the parse tree
	 */
	public void exitDeclarationList(XParser.DeclarationListContext ctx){}
   @Override public void visitTerminal(TerminalNode terminal) {

// if(terminal.getText().equals("main")){
// 	if(map.containsKey(label))
// 		map.get(label).add("Start");
// 	else
// 		map.computeIfAbsent(label, k->new ArrayList<String>()).add("Start");
// 	label++;
// }
// else if(terminal.getText().equals(";")){
// 	label++;
// }
// else if(terminal.getText().equals(")")){
// 	label++;
// }
// else if(!terminal.getText().equals("double") && !terminal.getText().equals("char") && !terminal.getText().equals("float") && !terminal.getText().equals("int") && !terminal.getText().equals("main") && !terminal.getText().equals("(") && !terminal.getText().equals(")") && !terminal.getText().equals("{") && !terminal.getText().equals("}"))
// {
// 	if(map.containsKey(label))
// 		map.get(label).add(terminal.getText());
// 	else
// 		map.computeIfAbsent(label, k->new ArrayList<String>()).add(terminal.getText());
// }
        //System.err.println("Hash: " + map);    
		map.add(terminal.getText());        
    }

    @Override public void enterEveryRule(ParserRuleContext context) { }
    @Override public void exitEveryRule(ParserRuleContext context) { }
    @Override public void visitErrorNode(ErrorNode node) { }



}