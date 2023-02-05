// This is a generated file. Not intended for manual editing.
package tirke.cupPlugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static tirke.cupPlugin.psi.CupTypes.*;
import static tirke.cupPlugin.parser.CupParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CupParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType type, PsiBuilder builder) {
    parseLight(type, builder);
    return builder.getTreeBuilt();
  }

  public void parseLight(IElementType type, PsiBuilder builder) {
    boolean result;
    builder = adapt_builder_(type, builder, this, null);
    Marker marker = enter_section_(builder, 0, _COLLAPSE_, null);
    result = parse_root_(type, builder);
    exit_section_(builder, 0, marker, type, result, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType type, PsiBuilder builder) {
    return parse_root_(type, builder, 0);
  }

  static boolean parse_root_(IElementType type, PsiBuilder builder, int level) {
    return cupSpec(builder, level + 1);
  }

  /* ********************************************************** */
  // 'action' 'code' java_code ';'?
  public static boolean actionCode(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "actionCode")) return false;
    if (!nextTokenIs(builder, ACTION)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, ACTION_CODE, null);
    result = consumeTokens(builder, 1, ACTION, CODE);
    pinned = result; // pin = 1
    result = result && report_error_(builder, java_code(builder, level + 1));
    result = pinned && actionCode_3(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // ';'?
  private static boolean actionCode_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "actionCode_3")) return false;
    consumeToken(builder, SEMI);
    return true;
  }

  /* ********************************************************** */
  // 'class' identifier ';'
  public static boolean classNameDeclaration(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "classNameDeclaration")) return false;
    if (!nextTokenIs(builder, CLASS)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, CLASS_NAME_DECLARATION, null);
    result = consumeTokens(builder, 1, CLASS, IDENTIFIER, SEMI);
    pinned = result; // pin = 1
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  /* ********************************************************** */
  // actionCode | parserCode | initCode | scanCode
  public static boolean codeParts(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "codeParts")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, CODE_PARTS, "<code parts>");
    result = actionCode(builder, level + 1);
    if (!result) result = parserCode(builder, level + 1);
    if (!result) result = initCode(builder, level + 1);
    if (!result) result = scanCode(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // initialDeclaration codeParts* symbols* precedences* startWith? production*
  static boolean cupSpec(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "cupSpec")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = initialDeclaration(builder, level + 1);
    result = result && cupSpec_1(builder, level + 1);
    result = result && cupSpec_2(builder, level + 1);
    result = result && cupSpec_3(builder, level + 1);
    result = result && cupSpec_4(builder, level + 1);
    result = result && cupSpec_5(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // codeParts*
  private static boolean cupSpec_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "cupSpec_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!codeParts(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "cupSpec_1", pos)) break;
    }
    return true;
  }

  // symbols*
  private static boolean cupSpec_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "cupSpec_2")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!symbols(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "cupSpec_2", pos)) break;
    }
    return true;
  }

  // precedences*
  private static boolean cupSpec_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "cupSpec_3")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!precedences(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "cupSpec_3", pos)) break;
    }
    return true;
  }

  // startWith?
  private static boolean cupSpec_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "cupSpec_4")) return false;
    startWith(builder, level + 1);
    return true;
  }

  // production*
  private static boolean cupSpec_5(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "cupSpec_5")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!production(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "cupSpec_5", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'import' 'static'? qualifiedName ('.' '*')? ';'
  public static boolean importDeclaration(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "importDeclaration")) return false;
    if (!nextTokenIs(builder, IMPORT)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, IMPORT_DECLARATION, null);
    result = consumeToken(builder, IMPORT);
    pinned = result; // pin = 1
    result = result && report_error_(builder, importDeclaration_1(builder, level + 1));
    result = pinned && report_error_(builder, qualifiedName(builder, level + 1)) && result;
    result = pinned && report_error_(builder, importDeclaration_3(builder, level + 1)) && result;
    result = pinned && consumeToken(builder, SEMI) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // 'static'?
  private static boolean importDeclaration_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "importDeclaration_1")) return false;
    consumeToken(builder, STATIC);
    return true;
  }

  // ('.' '*')?
  private static boolean importDeclaration_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "importDeclaration_3")) return false;
    importDeclaration_3_0(builder, level + 1);
    return true;
  }

  // '.' '*'
  private static boolean importDeclaration_3_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "importDeclaration_3_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeTokens(builder, 0, DOT, STAR);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // 'init' 'with' java_code ';'?
  public static boolean initCode(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "initCode")) return false;
    if (!nextTokenIs(builder, INIT)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, INIT_CODE, null);
    result = consumeTokens(builder, 1, INIT, WITH);
    pinned = result; // pin = 1
    result = result && report_error_(builder, java_code(builder, level + 1));
    result = pinned && initCode_3(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // ';'?
  private static boolean initCode_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "initCode_3")) return false;
    consumeToken(builder, SEMI);
    return true;
  }

  /* ********************************************************** */
  // packageDeclaration? importDeclaration* classNameDeclaration?
  public static boolean initialDeclaration(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "initialDeclaration")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, INITIAL_DECLARATION, "<initial declaration>");
    result = initialDeclaration_0(builder, level + 1);
    pinned = result; // pin = 1
    result = result && report_error_(builder, initialDeclaration_1(builder, level + 1));
    result = pinned && initialDeclaration_2(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // packageDeclaration?
  private static boolean initialDeclaration_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "initialDeclaration_0")) return false;
    packageDeclaration(builder, level + 1);
    return true;
  }

  // importDeclaration*
  private static boolean initialDeclaration_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "initialDeclaration_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!importDeclaration(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "initialDeclaration_1", pos)) break;
    }
    return true;
  }

  // classNameDeclaration?
  private static boolean initialDeclaration_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "initialDeclaration_2")) return false;
    classNameDeclaration(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // '{:' java_raw ':}'
  public static boolean java_code(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "java_code")) return false;
    if (!nextTokenIs(builder, LEFTCUPBRACES)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, LEFTCUPBRACES);
    result = result && java_raw(builder, level + 1);
    result = result && consumeToken(builder, RIGHTCUPBRACES);
    exit_section_(builder, marker, JAVA_CODE, result);
    return result;
  }

  /* ********************************************************** */
  // java?
  public static boolean java_raw(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "java_raw")) return false;
    Marker marker = enter_section_(builder, level, _NONE_, JAVA_RAW, "<java raw>");
    consumeToken(builder, JAVA);
    exit_section_(builder, level, marker, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // identifier
  public static boolean label_id(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "label_id")) return false;
    if (!nextTokenIs(builder, IDENTIFIER)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, IDENTIFIER);
    exit_section_(builder, marker, LABEL_ID, result);
    return result;
  }

  /* ********************************************************** */
  // 'package' qualifiedName ';'
  public static boolean packageDeclaration(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "packageDeclaration")) return false;
    if (!nextTokenIs(builder, PACKAGE)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, PACKAGE_DECLARATION, null);
    result = consumeToken(builder, PACKAGE);
    pinned = result; // pin = 1
    result = result && report_error_(builder, qualifiedName(builder, level + 1));
    result = pinned && consumeToken(builder, SEMI) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  /* ********************************************************** */
  // 'parser' 'code' java_code ';'?
  public static boolean parserCode(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "parserCode")) return false;
    if (!nextTokenIs(builder, PARSER)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, PARSER_CODE, null);
    result = consumeTokens(builder, 1, PARSER, CODE);
    pinned = result; // pin = 1
    result = result && report_error_(builder, java_code(builder, level + 1));
    result = pinned && parserCode_3(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // ';'?
  private static boolean parserCode_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "parserCode_3")) return false;
    consumeToken(builder, SEMI);
    return true;
  }

  /* ********************************************************** */
  // 'precedence' ('left' | 'right' | 'nonassoc') termNameList
  public static boolean precedences(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "precedences")) return false;
    if (!nextTokenIs(builder, PRECED)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, PRECEDENCES, null);
    result = consumeToken(builder, PRECED);
    pinned = result; // pin = 1
    result = result && report_error_(builder, precedences_1(builder, level + 1));
    result = pinned && termNameList(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // 'left' | 'right' | 'nonassoc'
  private static boolean precedences_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "precedences_1")) return false;
    boolean result;
    result = consumeToken(builder, LEFT);
    if (!result) result = consumeToken(builder, RIGHT);
    if (!result) result = consumeToken(builder, NONASSOC);
    return result;
  }

  /* ********************************************************** */
  // symbol_id (':' label_id)?
  //                         |   java_code
  public static boolean prod_part(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "prod_part")) return false;
    if (!nextTokenIs(builder, "<prod part>", IDENTIFIER, LEFTCUPBRACES)) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, PROD_PART, "<prod part>");
    result = prod_part_0(builder, level + 1);
    if (!result) result = java_code(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // symbol_id (':' label_id)?
  private static boolean prod_part_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "prod_part_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = symbol_id(builder, level + 1);
    result = result && prod_part_0_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (':' label_id)?
  private static boolean prod_part_0_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "prod_part_0_1")) return false;
    prod_part_0_1_0(builder, level + 1);
    return true;
  }

  // ':' label_id
  private static boolean prod_part_0_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "prod_part_0_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, COLON);
    result = result && label_id(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // symbol_id '::=' rhs ('|' rhs)* ';'
  public static boolean production(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "production")) return false;
    if (!nextTokenIs(builder, IDENTIFIER)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, PRODUCTION, null);
    result = symbol_id(builder, level + 1);
    pinned = result; // pin = 1
    result = result && report_error_(builder, consumeToken(builder, CCEQ));
    result = pinned && report_error_(builder, rhs(builder, level + 1)) && result;
    result = pinned && report_error_(builder, production_3(builder, level + 1)) && result;
    result = pinned && consumeToken(builder, SEMI) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // ('|' rhs)*
  private static boolean production_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "production_3")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!production_3_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "production_3", pos)) break;
    }
    return true;
  }

  // '|' rhs
  private static boolean production_3_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "production_3_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, BAR);
    result = result && rhs(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // identifier ('.' identifier)*
  public static boolean qualifiedName(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "qualifiedName")) return false;
    if (!nextTokenIs(builder, IDENTIFIER)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, IDENTIFIER);
    result = result && qualifiedName_1(builder, level + 1);
    exit_section_(builder, marker, QUALIFIED_NAME, result);
    return result;
  }

  // ('.' identifier)*
  private static boolean qualifiedName_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "qualifiedName_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!qualifiedName_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "qualifiedName_1", pos)) break;
    }
    return true;
  }

  // '.' identifier
  private static boolean qualifiedName_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "qualifiedName_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeTokens(builder, 0, DOT, IDENTIFIER);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // prod_part* ['%prec' symbol_id]
  public static boolean rhs(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "rhs")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, RHS, "<rhs>");
    result = rhs_0(builder, level + 1);
    result = result && rhs_1(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // prod_part*
  private static boolean rhs_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "rhs_0")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!prod_part(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "rhs_0", pos)) break;
    }
    return true;
  }

  // ['%prec' symbol_id]
  private static boolean rhs_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "rhs_1")) return false;
    rhs_1_0(builder, level + 1);
    return true;
  }

  // '%prec' symbol_id
  private static boolean rhs_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "rhs_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, PERCENT_PREC);
    result = result && symbol_id(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // 'scan' 'with' java_code ';'?
  public static boolean scanCode(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "scanCode")) return false;
    if (!nextTokenIs(builder, SCAN)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, SCAN_CODE, null);
    result = consumeTokens(builder, 1, SCAN, WITH);
    pinned = result; // pin = 1
    result = result && report_error_(builder, java_code(builder, level + 1));
    result = pinned && scanCode_3(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // ';'?
  private static boolean scanCode_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "scanCode_3")) return false;
    consumeToken(builder, SEMI);
    return true;
  }

  /* ********************************************************** */
  // 'start' 'with' identifier ';'
  public static boolean startWith(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "startWith")) return false;
    if (!nextTokenIs(builder, START)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, START_WITH, null);
    result = consumeTokens(builder, 1, START, WITH, IDENTIFIER, SEMI);
    pinned = result; // pin = 1
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  /* ********************************************************** */
  // identifier
  public static boolean symbolDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "symbolDefinition")) return false;
    if (!nextTokenIs(builder, IDENTIFIER)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, IDENTIFIER);
    exit_section_(builder, marker, SYMBOL_DEFINITION, result);
    return result;
  }

  /* ********************************************************** */
  // identifier
  public static boolean symbol_id(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "symbol_id")) return false;
    if (!nextTokenIs(builder, IDENTIFIER)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, IDENTIFIER);
    exit_section_(builder, marker, SYMBOL_ID, result);
    return result;
  }

  /* ********************************************************** */
  // ( 'terminal' | 'non' 'terminal' | 'nonterminal' )
  //                             ( typeId symbolDefinition (',' symbolDefinition)*
  //                             | symbolDefinition (',' symbolDefinition)* )  ';'
  public static boolean symbols(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "symbols")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, SYMBOLS, "<symbols>");
    result = symbols_0(builder, level + 1);
    pinned = result; // pin = 1
    result = result && report_error_(builder, symbols_1(builder, level + 1));
    result = pinned && consumeToken(builder, SEMI) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // 'terminal' | 'non' 'terminal' | 'nonterminal'
  private static boolean symbols_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "symbols_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, TERMINAL);
    if (!result) result = parseTokens(builder, 0, NON, TERMINAL);
    if (!result) result = consumeToken(builder, NONTERMINAL);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // typeId symbolDefinition (',' symbolDefinition)*
  //                             | symbolDefinition (',' symbolDefinition)*
  private static boolean symbols_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "symbols_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = symbols_1_0(builder, level + 1);
    if (!result) result = symbols_1_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // typeId symbolDefinition (',' symbolDefinition)*
  private static boolean symbols_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "symbols_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = typeId(builder, level + 1);
    result = result && symbolDefinition(builder, level + 1);
    result = result && symbols_1_0_2(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (',' symbolDefinition)*
  private static boolean symbols_1_0_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "symbols_1_0_2")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!symbols_1_0_2_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "symbols_1_0_2", pos)) break;
    }
    return true;
  }

  // ',' symbolDefinition
  private static boolean symbols_1_0_2_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "symbols_1_0_2_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, COMMA);
    result = result && symbolDefinition(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // symbolDefinition (',' symbolDefinition)*
  private static boolean symbols_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "symbols_1_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = symbolDefinition(builder, level + 1);
    result = result && symbols_1_1_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (',' symbolDefinition)*
  private static boolean symbols_1_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "symbols_1_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!symbols_1_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "symbols_1_1_1", pos)) break;
    }
    return true;
  }

  // ',' symbolDefinition
  private static boolean symbols_1_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "symbols_1_1_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, COMMA);
    result = result && symbolDefinition(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // identifier (',' identifier)* ';'
  public static boolean termNameList(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "termNameList")) return false;
    if (!nextTokenIs(builder, IDENTIFIER)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, IDENTIFIER);
    result = result && termNameList_1(builder, level + 1);
    result = result && consumeToken(builder, SEMI);
    exit_section_(builder, marker, TERM_NAME_LIST, result);
    return result;
  }

  // (',' identifier)*
  private static boolean termNameList_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "termNameList_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!termNameList_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "termNameList_1", pos)) break;
    }
    return true;
  }

  // ',' identifier
  private static boolean termNameList_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "termNameList_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeTokens(builder, 0, COMMA, IDENTIFIER);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // qualifiedName
  //                         |    '?' (('extends' | 'super') qualifiedName)?
  public static boolean typeArgument(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typeArgument")) return false;
    if (!nextTokenIs(builder, "<type argument>", IDENTIFIER, QM)) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, TYPE_ARGUMENT, "<type argument>");
    result = qualifiedName(builder, level + 1);
    if (!result) result = typeArgument_1(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // '?' (('extends' | 'super') qualifiedName)?
  private static boolean typeArgument_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typeArgument_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, QM);
    result = result && typeArgument_1_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (('extends' | 'super') qualifiedName)?
  private static boolean typeArgument_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typeArgument_1_1")) return false;
    typeArgument_1_1_0(builder, level + 1);
    return true;
  }

  // ('extends' | 'super') qualifiedName
  private static boolean typeArgument_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typeArgument_1_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = typeArgument_1_1_0_0(builder, level + 1);
    result = result && qualifiedName(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // 'extends' | 'super'
  private static boolean typeArgument_1_1_0_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typeArgument_1_1_0_0")) return false;
    boolean result;
    result = consumeToken(builder, EXTENDS);
    if (!result) result = consumeToken(builder, SUPER);
    return result;
  }

  /* ********************************************************** */
  // '<' typeArgument? (',' typeArgument)* '>'
  public static boolean typeArguments(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typeArguments")) return false;
    if (!nextTokenIs(builder, LEFTI)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, LEFTI);
    result = result && typeArguments_1(builder, level + 1);
    result = result && typeArguments_2(builder, level + 1);
    result = result && consumeToken(builder, RIGHTI);
    exit_section_(builder, marker, TYPE_ARGUMENTS, result);
    return result;
  }

  // typeArgument?
  private static boolean typeArguments_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typeArguments_1")) return false;
    typeArgument(builder, level + 1);
    return true;
  }

  // (',' typeArgument)*
  private static boolean typeArguments_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typeArguments_2")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!typeArguments_2_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "typeArguments_2", pos)) break;
    }
    return true;
  }

  // ',' typeArgument
  private static boolean typeArguments_2_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typeArguments_2_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, COMMA);
    result = result && typeArgument(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // qualifiedName typeArguments?
  public static boolean typeId(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typeId")) return false;
    if (!nextTokenIs(builder, IDENTIFIER)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = qualifiedName(builder, level + 1);
    result = result && typeId_1(builder, level + 1);
    exit_section_(builder, marker, TYPE_ID, result);
    return result;
  }

  // typeArguments?
  private static boolean typeId_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typeId_1")) return false;
    typeArguments(builder, level + 1);
    return true;
  }

}
