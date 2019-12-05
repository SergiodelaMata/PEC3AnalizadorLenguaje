lexer grammar Pl2compilerLexer;

CONDICIONES: IF | ELSE;

//IFELSE: IF ' ' ELSE;
//Keywords
SWITCH: 'switch';
ENDSWITCH: 'endswitch';
CASE: 'case';
BREAK: 'break';
DEFAULT: 'default';
BOOLEAN: FALSO | VERDADERO;
FALSO: 'false' | '!true';
VERDADERO: 'true' | '!false';
IF: 'if';
ELSE: 'else';
THEN: 'then';
ENDIF: 'endif';
BEGIN: 'begin';
END: 'end';
INCLUDE: 'include';
FUNCTION: 'function';
VOID: 'void';
STRING: 'cadena';
WHILE: 'while';
FOR: 'for';
ENDFOR: 'enddo';
FROM: 'from';
STEP: 'step';
TO: 'to';
DO: 'do';
NUMERO: 'numero';
DEVOLVER: 'devolver';
MAIN: 'main';
PC: ';';
PL: '(';
PR: ')';
DOSPUNTOS: ':';
PUNTO: '.';
COMA: ',';
INCREMENTOEN1: '++';
DECREMENTOEN1: '--';
ADD: '+';
MINUS: '-';
PRODUCT: '*';
DIVISION: '/';
ASIGN: ':=';
PORCENTAJE: '%';
MENORQUE: '<';
MAYORQUE: '>';
IGUALQUE: '==';
DISTINTOQUE: '!=';

PUERTALOGICAAND: 'and' | '&&';
PUERTALOGICAOR: 'or' | '||';

DIGITO: ('-')?[0-9]+;
FLOTANTE: DIGITO+ PUNTO DIGITO+;
NEWLINE : [\t\r\n]+ ->skip;
ID: [a-zA-Z0-9_]+;
NOMBREPAQUETE : ID (PUNTO ID)*;
CADENA: '"' (ESC|.)*? '"' {setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(.)", "$1"));};
fragment ESC: '\\' [btnr"\\];
COMENTARIO_LINEA: '//' .*? '\n' ->skip;
COMENTARIO_LINEA2: '/*' .*? '*/' ->skip;
COMENTARIO_BLOQUE: '/**' .*? '**/' ->skip;
COMENTARIO_DOCUMENTACION: '/***' .*? '***/' ->skip;
WS: ([\t\n\r]+ 
    | ' '+ )
    ->skip;