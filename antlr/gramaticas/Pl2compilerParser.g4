parser grammar Pl2compilerParser;

options {
	tokenVocab = Pl2compilerLexer;
	language = Java;
}

prog: (libreria|crearfuncion)+;
libreria: (palabraclaveincluirlibreria nombrepaquete separadoroperaciones)+;
asignacion: ((tipovariable? nombrevariable (operadorasignacion expr)?)
            | (tipovariable nombrevariable (separadoroperadores nombrevariable)*)) separadoroperaciones?;
//variable: tipovariable? nombrevariable operadorasignacion expr;
condicion: operadoraperturaparentesis expresionlogica operadorcierreparentesis;
//operacionswitch: cabeceraswitch cuerposwitch;
//cabeceraswitch: palabrareservadaaperturaswitch operadoraperturaparentesis expr operadorcierreparentesis;
//cuerposwitch: (palabrareservadacase expr separadordospuntos (cuerpo2|cuerpo) (palabrareservadabreak separadoroperaciones)?)+ (palabrareservadadefault separadordospuntos (cuerpo2|cuerpo) (palabrareservadabreak separadoroperaciones)?) palabrareservadacierrewitch;
condicionalif: palabraclaveifcondicion ((condicion)
            | (condicion (operadorcondicionalpuertalogica condicion)*))? palabraclavethen? (cuerpo2|cuerpo3|cuerpo);
condicionalelse: palabraclaveelsecondicion (cuerpo2|cuerpo3|cuerpo);
condicionales:  condicionalif condicionalelse? palabraclaveendif;
funcionwhile: palabraclavebuclewhile operadoraperturaparentesis (expr|expresionlogica) operadorcierreparentesis (cuerpo|cuerpo2|cuerpo3);
//funcionfor: palabraclavebuclefor operadoraperturaparentesis (variable|nombrevariable) (separadoroperaciones expresionlogica) (separadoroperaciones variable|nombrevariable (operadoraritmeticosuma1 |operadoraritmeticoresta1)) operadorcierreparentesis cuerpo;
funcionfor: palabraclavebuclefor nombrevariable palabraclaveinciovalorfor (nombrevariable|numeros) palabraclavefinvalorfor (nombrevariable|numeros) (palabraclavesaltoelementofor (nombrevariable|numeros))? palabraclavehacerfor (cuerpo|cuerpo2|cuerpo3) palabraclaveendbuclefor;
cuerpo: palabraclaveinicio  codigo palabraclavefin;
//cuerpo2: (palabraclaveinicio codigo* palabraclavefin)+;
cuerpo2: (asignacion|llamarfuncion) | (palabraclaveinicio (asignacion|llamarfuncion)+ palabraclavefin);
cuerpo3: (asignacion|llamarfuncion)+ | (palabraclaveinicio (asignacion|llamarfuncion)+ palabraclavefin);
//llamarfuncion: ((nombrefuncion operadoraperturaparentesis parametros? operadorcierreparentesis separadoroperaciones?) | funcionfor | funcionwhile | condicionales| operacionswitch);
llamarfuncion: (llamadafuncion | funcionfor | funcionwhile | condicionales);
llamadafuncion: (nombrefuncion operadoraperturaparentesis parametros? operadorcierreparentesis separadoroperaciones?);
codigo: ((asignacion|llamarfuncion)+ |devolver);
//codigo: (funcionwhile|funcionfor|operacionswitch|asignacion|llamarfuncion|devolver|cuerpo2)+;
crearfuncion: cabecerafuncion cuerpo;
devolver: palabraclavefunciondevolver operadoraperturaparentesis (llamarfuncion|expr)? operadorcierreparentesis separadoroperaciones;
retorno : tipovariable;

cabecerafuncion:  palabraclavecreacionfuncion (nombrefuncion|palabraclavefuncionmain) operadoraperturaparentesis parametros? operadorcierreparentesis separadordospuntos retorno;
expr:	expr (operadoraritmeticoproducto|operadoraritmeticodivision) expr
    |	expr (operadoraritmeticosuma|operadoraritmeticoresta) expr
    |   llamadafuncion
    |	numeros
    |   nombrevariable
    |   operadoraperturaparentesis (nombrevariable|numeros) (separadoroperadores (nombrevariable|numeros))* operadorcierreparentesis
    |   cadena  (operadoraritmeticosuma expr)*
    |	operadoraperturaparentesis expr operadorcierreparentesis
    ;
expresionlogica: (expr|palabraclavebooleano) ((operadorlogico|operadorcondicionalpuertalogica) (expr|palabraclavebooleano|expresionlogica))+
                | palabraclavebooleano;

nombrefuncion: ID;
nombrevariable: ARRAY | ID | CASE;
nombrepaquete: ID;
operadorasignacion: ASIGN;
parametros:  parametro (separadoroperadores parametro)* ;
parametro: tipovariable? expr;
operadoraritmeticoproducto: PRODUCT;
operadoraritmeticodivision: DIVISION;
operadoraritmeticosuma: ADD;
operadoraritmeticoresta: MINUS;
operadoraritmeticosuma1: INCREMENTOEN1;
operadoraritmeticoresta1: DECREMENTOEN1;

operadorlogico: MENORQUE|MAYORQUE|IGUALQUE|DISTINTOQUE;
operadorcondicionalpuertalogica: PUERTALOGICAAND | PUERTALOGICAOR;
cadena: CADENA;
separadoroperaciones: PC;
separadoroperadores: COMA;
separadordospuntos: DOSPUNTOS;
operadoraperturaparentesis: PL;
operadorcierreparentesis: PR;
tipovariable: STRING|NUMERO|VOID;
comentarios: COMENTARIO_LINEA
            | COMENTARIO_LINEA2
            | COMENTARIO_BLOQUE
            | COMENTARIO_DOCUMENTACION
            ;
entero: DIGITO+;
flotante: FLOTANTE;
numeros: entero | flotante;

//Keywords:
palabraclavebooleano: BOOLEAN;
palabraclavebuclefor: FOR;
palabraclaveendbuclefor: ENDFOR;
palabraclaveinciovalorfor: FROM;
palabraclavesaltoelementofor: STEP;
palabraclavefinvalorfor: TO;
palabraclavehacerfor: DO;
palabraclavebuclewhile: WHILE;
//palabrareservadaaperturaswitch: SWITCH;
//palabrareservadacierrewitch: ENDSWITCH;
palabrareservadacase: CASE;
palabrareservadabreak: BREAK;
palabrareservadadefault: DEFAULT;
palabraclaveifcondicion: IF;
palabraclaveelsecondicion: ELSE;
palabraclavethen: THEN;
palabraclaveendif: ENDIF;
palabraclaveincluirlibreria: INCLUDE;
palabraclavecreacionfuncion: FUNCTION;
palabraclavefuncionmain: MAIN;
palabraclavefunciondevolver: DEVOLVER;
palabraclaveinicio: BEGIN;
palabraclavefin: END;
