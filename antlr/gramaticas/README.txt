CONSIDERACIONES PARA LOS PUNTOS FUNCION:

    - := ha sido considerado como operador.

    -For:
        -Se suma 1 punto por operacion de la condicion + los puntos del interior de la condicion y 
        esto se eleva al cuadrado.
        -A los puntos de la ondicion se suman los puntos de la linea de cabecera del for
        -La cabecera del for tiene 1 punto por la declaracion, 1 punto por la asignacion, 1 punto 
        por la asignacion de cada iteracion y 1 punto por el operador suma de las iteraciones. El total 
        de la cabecera son 4 puntos.

    -Se han considerado lineas efectivas las lineas reales del programa que ejcutan algo. Como lineas 
    reales entendemos las cabeceras de las bifurcaciones completas y las asignaciones, llamadas y 
    declaraciones hasta el final (punto y como cuando lo tiene).

    -If y while: las condiciones de la cabecera se consideran puntos interiores, y por lo tanto, también 
    se elevan al cuadrado.