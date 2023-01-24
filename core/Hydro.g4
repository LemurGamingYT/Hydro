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

AT : '@';
SEMI : ';';
COLON : ':';
TILDE : '~';
QUESTION : '?';

LARROW : '->';
RARROW : '<-';
ARROWASSIGN : '=>';

DOUBLECOLONS : '::';

INCREMENT : '++';
DECREMENT : '--';
AMPERSAND : '&';


// Operators
ARITHMATICOPERATORS : '*' | '+' | '-' | '/' | '%' | '**';
COMPARATIVEOPERATORS : '==' | '!=' | '>' | '<' | '>=' | '<=';
SHORTASSIGNOPS : '+=' | '-=' | '*=' | '%=' | '/=' | '**=';
BOOLEANOPERATORS : '&&' | '||';
UNARYOPERATOR : '!';


/// Keywords

THREAD : 'thread';
TASK : 'task';
FUNC : 'func';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
FOR : 'for';
IMPORT : 'import';
FROM : 'from';
CLASS : 'class';
NEW : 'new';
OVERRIDE : 'override';

/// Skipped Rules
COMMENT : '//' ~[\r\n]* -> skip;
WS : [ \t\r\n] -> skip;

/// Data Types
BOOL : ('true' | 'false');
NULL : 'null';

ID : [a-zA-Z_] [a-zA-Z_0-9]*;
INT : '-'? [0-9]+;
FLOAT : '-'? [0-9]+? '.' [0-9]*;
STRING : '"' (~["\r\n] | '""')* '"';

ANY : (ID | NULL | STRING | INT | FLOAT | BOOL);

// Variable Types
TYPE : ('int' | 'float' | 'string' | 'bool' | 'null');

/* Parser rules */

program : stmt* EOF;

block: stmt*;

stmt
    : conditional_stmt SEMI?
    | assignments SEMI?
    | call SEMI?
    | expr SEMI?
    | classdef SEMI?
    | import_stmt SEMI?
    ;

import_stmt: IMPORT LBRACE STRING (COMMA STRING)*? RBRACE (FROM STRING)?;

assignments: varassignment | funcassignment;
funcassignment: (FUNC | ID) OVERRIDE? ID LPAREN (ID? ID (COMMA ID? ID)?)? RPAREN stmt_block; // | ID ASSIGN LPAREN (ID (COMMA ID))? RPAREN ARROWASSIGN stmt_block;
varassignment: TYPE? ID QUESTION? ASSIGN expr;

clsassign: NEW ID LPAREN args? RPAREN;
classdef
    : CLASS ID (RARROW ID)? LBRACE define_blocks RBRACE
    | CLASS ID (LBRACE RARROW ID (COMMA ID)? RBRACE)? LBRACE define_blocks RBRACE
    ;

define_blocks
    : funcassignment*
    | varassignment*
    ;

getattribs: (STRING | ID) DOT ID (LPAREN args? RPAREN)?;
attrassign: ID DOT ID ASSIGN expr;

call: THREAD? ID LPAREN args? RPAREN;

conditional_stmt
    : if_stmt
    | while_stmt
    | for_stmt
    ;

if_stmt: IF conditional_block stmt_block (ELSE IF conditional_block stmt_block)* (ELSE stmt_block)?;
while_stmt: WHILE conditional_block stmt_block;
for_stmt
    : FOR ID SEMI conditional_block SEMI ID (INCREMENT | DECREMENT) stmt_block
    | FOR ID expr stmt_block
    ;

conditional_block
    : LPAREN expr RPAREN
    | expr
    ;

stmt_block: LBRACE block RBRACE;

args: expr (COMMA expr)?;

type_conversion: LPAREN ID RPAREN ANY;

list : LLIST args? RLIST;

expr
    : expr op=BOOLEANOPERATORS expr
    | expr op=ARITHMATICOPERATORS expr
    | expr op=COMPARATIVEOPERATORS expr
    | UNARYOPERATOR expr
    | type_conversion
    | getattribs
    | attrassign
    | clsassign
    | call
    | list
    | atom
    ;

atom
    : INT
    | FLOAT
    | ID
    | BOOL
    | NULL
    | STRING
    ;
