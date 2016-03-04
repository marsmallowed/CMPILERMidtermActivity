/**
 * Define a grammar called Hello
 */
grammar Hello;
@header {
	package antlr;
}
// LEXER
Num : '-'*[0-9]+;
AddOp : '+';
SubOp : '-';
MultOp : '*';
DivOp : '/';
ModOp : '%';

// PARSER
s :
		expr s
	|	expr;
expr :
		'(' expr ')'
	|	expr MultOp expr
	|	expr DivOp expr
	|	expr ModOp expr
	|	expr AddOp expr
	|	expr SubOp expr
	|	Num;

//addsub :
//		expr AddOp expr
//	|	expr SubOp expr;
//
//multdivmod :
//			expr MultOp expr
//		|	expr DivOp expr
//		|	expr ModOp expr;

WS : [' '\t\n\r]+ -> skip;
