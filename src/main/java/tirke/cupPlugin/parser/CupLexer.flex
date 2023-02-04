package tirke.cupPlugin.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static tirke.cupPlugin.psi.CupTypes.*;

%%

%{
  public _CupLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _CupLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

IDENTIFIER=[a-zA-Z_0-9]+
LINE_COMMENT="//".*
BLOCK_COMMENT="/*" ~"*/"
SPACE=[ \t\n\x0B\f\r]+

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return WHITE_SPACE; }

  "|"                  { return BAR; }
  "::="                { return CCEQ; }
  ":"                  { return COLON; }
  ","                  { return COMMA; }
  "<"                  { return LEFTI; }
  ">"                  { return RIGHTI; }
  "{:"                 { return LEFTCUPBRACES; }
  ":}"                 { return RIGHTCUPBRACES; }
  "."                  { return DOT; }
  "?"                  { return QM; }
  ";"                  { return SEMI; }
  "*"                  { return STAR; }
  "class"              { return CLASS; }
  "extends"            { return EXTENDS; }
  "import"             { return IMPORT; }
  "package"            { return PACKAGE; }
  "static"             { return STATIC; }
  "super"              { return SUPER; }
  "action"             { return ACTION; }
  "code"               { return CODE; }
  "init"               { return INIT; }
  "parser"             { return PARSER; }
  "scan"               { return SCAN; }
  "start"              { return START; }
  "with"               { return WITH; }
  "non"                { return NON; }
  "nonterminal"        { return NONTERMINAL; }
  "terminal"           { return TERMINAL; }
  "left"               { return LEFT; }
  "nonassoc"           { return NONASSOC; }
  "%prec"              { return PERCENT_PREC; }
  "precedence"         { return PRECED; }
  "right"              { return RIGHT; }
  "JAVA"               { return JAVA; }

  {IDENTIFIER}         { return IDENTIFIER; }
  {LINE_COMMENT}       { return LINE_COMMENT; }
  {BLOCK_COMMENT}      { return BLOCK_COMMENT; }
  {SPACE}              { return SPACE; }

}

[^] { return BAD_CHARACTER; }
