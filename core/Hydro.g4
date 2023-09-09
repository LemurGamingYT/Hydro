grammar Hydro;

/* Lexer rules */

/// Symbols

LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LLIST : '[';
RLIST : ']';
ASSIGN : '=';
DOT : '.';
COMMA : ',';
COLON : ':';
SEMI : ';';
LARROW : '->';
RARROW : '<-';
ARROWASSIGN : '=>';
TILDE : '~';

// Operators
ARITHMATICOPERATORS : '*' | '+' | '-' | '/' | '%' | '**';
COMPARATIVEOPERATORS : '==' | '!=' | '>' | '<' | '>=' | '<=';
SHORTASSIGNOPS : '+=' | '-=' | '*=' | '%=' | '/=' | '**=';
BOOLEANOPERATORS : '&&' | '||';
UNARYOPERATOR : '!';


/// Keywords

FUNC : 'func';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
IMPORT : 'import';
FROM : 'from';
CLASS : 'class';
NEW : 'new';

/// Skipped Rules
COMMENT : ('//' | '<--') ~[\r\n]* -> skip;
WS : [ \t\r\n] -> skip;
MULTILINECOMMENT : '/*' .*? '*/' -> skip;

/// Data Types
BOOL : ('true' | 'false');
NUL : 'null';

ID : [a-zA-Z_] [a-zA-Z_0-9]*;
INT : '-'? [0-9]+;
FLOAT : '-'? [0-9]+? '.' [0-9]*;
STRING : '"' (~["\r\n] | '""')* '"';

/* Parser rules */

program : stmt* EOF;

block: LBRACE stmt* RBRACE;

stmt
    : if_stmt
    | while_stmt
    | varassignment SEMI?
    | funcassignment
    | call SEMI?
    | expr SEMI?
    | classdef SEMI?
    | import_stmt SEMI?
    ;

import_stmt
    : IMPORT LBRACE STRING (COMMA STRING)* RBRACE (FROM STRING)?
    | IMPORT STRING (FROM STRING)?
    ;

funcassignment
    : FUNC ID LPAREN params? RPAREN block
    | ID LPAREN params? RPAREN ARROWASSIGN block
    ;

varassignment: ID? ID ASSIGN expr SEMI?;

clsassign: NEW ID LPAREN args? RPAREN;
classdef
    : CLASS ID (RARROW ID)? LBRACE define_blocks RBRACE
    | CLASS ID (LBRACE RARROW ID (COMMA ID)? RBRACE)? LBRACE define_blocks RBRACE
    ;

define_blocks
    : (FUNC TILDE? ID LPAREN params? RPAREN block)*
    | (ID ASSIGN expr)*
    ;

getattribs: atom DOT ID LPAREN args? RPAREN (DOT ID LPAREN args? RPAREN)*;
// attrassign: ID DOT ID ASSIGN expr;

call: ID LPAREN args? RPAREN;

if_stmt: IF conditional_block block (ELSE IF conditional_block block)* (ELSE block)?;
while_stmt: WHILE conditional_block block;
// for_stmt: FOR ID SEMI conditional_block SEMI ID (INCREMENT | DECREMENT) block;

conditional_block
    : LPAREN expr RPAREN
    | expr
    ;

args: expr (COMMA expr)*;
params: ID (COMMA ID)*;

type_conversion: LPAREN ID RPAREN atom;

list: LLIST args? RLIST;

dict_definitions : STRING COLON expr (COMMA STRING COLON expr)*;
dict: LBRACE dict_definitions? RBRACE;

funcassignment_expr: ID LPAREN params? RPAREN ARROWASSIGN block;

expr
    : expr op=BOOLEANOPERATORS expr
    | expr op=ARITHMATICOPERATORS expr
    | expr op=COMPARATIVEOPERATORS expr
    | UNARYOPERATOR expr
    | funcassignment_expr
    | type_conversion
    | getattribs
    //| attrassign
    | clsassign
    | call
    | atom
    ;

atom
    : INT
    | FLOAT
    | ID
    | BOOL
    | NUL
    | STRING
    | list
    | dict
    ;
