import java.util.ArrayList;
import java.lang.Math;

public class VisitorComplejidad extends Pl2compilerParserBaseVisitor
{
    File file = File.getInstance(); //Contains the symbol table
    TablaSimbolosComplejidadFuncion symbolTable; // = new TablaSimbolosComplejidadFuncion();
    String completeNameFunction;
    String nameFunction;
    int numParametersFunction;
    ArrayList<Integer> listNumberNode;
    PilaComplejidad stack;

    public VisitorComplejidad()
    {
        this.completeNameFunction = "";
        this.nameFunction = "";
        this.numParametersFunction = 0;
        this.listNumberNode = new ArrayList<Integer>();
        this.listNumberNode.add(0);             //El primer nodo será el 0
        this.stack = new PilaComplejidad();
        this.symbolTable = new TablaSimbolosComplejidadFuncion();
    }

    @Override
    public Integer visitProg(Pl2compilerParser.ProgContext ctx)
    {
        ArrayList<Pl2compilerParser.CrearfuncionContext> listaCrearFuncion = new ArrayList<Pl2compilerParser.CrearfuncionContext>(ctx.crearfuncion());
        if(listaCrearFuncion.size() != 0)
        {
            for(int i = 0; i < listaCrearFuncion.size(); i++)
            {
                symbolTable = new TablaSimbolosComplejidadFuncion();
                visit(listaCrearFuncion.get(i));
                //System.out.println(completeNameFunction);
                //System.out.println(nameFunction);
                //System.out.println(numParametersFunction);
                System.out.println("fñjdsalkjfañlkdsfjañlkdsjfñalkjfñlksadjñflkajdsñflkjdsñlkdsjfañlkdsjñalkjfdña");
                for(int j = 0; j < listNumberNode.size(); j++)
                {
                  if(j%10 == 0)
                  {
                    System.out.println("");
                  }
                  System.out.print(listNumberNode.get(j) + " ");
                }
                System.out.println("");
                symbolTable.setListNode(listNumberNode);
                file.getTablaSimbolosComplejidad().putFunctionSymbolTable(symbolTable);
                this.completeNameFunction = "";         //Para tener el nombre completo de la función con los nombres de sus parámetros
                this.nameFunction = "";                 //Función sin parámetros
                this.numParametersFunction = 0;         //Nº de parámetros
                this.listNumberNode = new ArrayList<Integer>(); //Lista de los números de los nodos usados en la creación de la función
                this.listNumberNode.add(0);             //El primer nodo será el 0
                this.stack = new PilaComplejidad();
            }
        }
        return 1; //no seria 0 (realmente da igual)?
    }
    @Override
    public Integer visitCrearfuncion(Pl2compilerParser.CrearfuncionContext ctx)
    {
        visit(ctx.cabecerafuncion());
        visit(ctx.cuerpo());
        return 1;
    }
    @Override
    public Integer visitCabecerafuncion(Pl2compilerParser.CabecerafuncionContext ctx)
    {
        completeNameFunction += ctx.palabraclavecreacionfuncion().FUNCTION().getText() + " ";
        if(ctx.nombrefuncion() != null)
        {
            completeNameFunction += ctx.nombrefuncion().ID().getText() + "(";
        }
        else if(ctx.palabraclavefuncionmain() != null)
        {
            completeNameFunction += ctx.palabraclavefuncionmain().MAIN().getText() + "(";
        }
        nameFunction = completeNameFunction + ")";
        if(ctx.parametros() != null)
        {
          ArrayList<Pl2compilerParser.ParametroContext> listaParametros = new ArrayList<Pl2compilerParser.ParametroContext>(ctx.parametros().parametro());
          numParametersFunction = listaParametros.size();
          ArrayList<String> listaNombreVariables = new ArrayList<String>();
          for(int i=0; i < listaParametros.size();i++)
          {
            if(listaParametros.get(i).expr().nombrevariable() != null)
            {
              listaNombreVariables.add(listaParametros.get(i).expr().nombrevariable().get(0).ID().getText());
            }
          }
          if(listaNombreVariables.size() != 0)
          {
            for(int j=0; j < listaNombreVariables.size(); j++)
            {
              if(j != 0)
              {
                completeNameFunction += ",";
              }
              completeNameFunction += listaNombreVariables.get(j);
            }
          }
        }
        completeNameFunction += ")";
        System.out.println(completeNameFunction);
        symbolTable.setFunctionName(completeNameFunction);
        return 1;
    }
    @Override
    public Integer visitCuerpo(Pl2compilerParser.CuerpoContext ctx)
    {
        return (int) visit(ctx.codigo());
    }
    @Override
    public Integer visitCuerpo2(Pl2compilerParser.Cuerpo2Context ctx)
    {
        ArrayList<Pl2compilerParser.LlamarfuncionContext> listLlamadas = new ArrayList<Pl2compilerParser.LlamarfuncionContext>(ctx.llamarfuncion());
        ArrayList<Pl2compilerParser.AsignacionContext> listaAsignaciones = new ArrayList<Pl2compilerParser.AsignacionContext>(ctx.asignacion());
        int numberNode = 0;

        for(int i = 0; i < listaAsignaciones.size(); i++)
        {
          stack.push((int)visit(listaAsignaciones.get(i)));
        }
        numberNode = stack.getLast();
        /*for(int i = 0; i < listaAsignaciones.size(); i++)
        {
          if(i == 0)
          {
            numberNode = stack.pop();
          }
          else
          {
            stack.pop();
          }
        }*/

        if(listLlamadas.size() != 0)
        {
          //stack.push(numberNode);
          for(int i = 0; i < listLlamadas.size(); i++)//Introduce en una pila los nodos que se han utilizado como última posición de una secuencia de una llamada
          {
            if(listLlamadas.get(i).llamadafuncion() == null) //No es una llamada a función
            {
              stack.push((int)visit(listLlamadas.get(i)));
            }
            else
            {

              stack.push((int)visit(listLlamadas.get(i)));
            }
          }
          /*for(int i = 0; i < listLlamadas.size(); i++) //Salva solo la última posición de las secuencias de llamadas realizadas
          {
            if(listLlamadas.get(i).llamadafuncion() == null) //No es una llamada
            {
              if(i == 0)
              {
                numberNode = stack.pop();
              }
              else
              {
                stack.pop();
              }
            }
            else
            {
              stack.pop();
            }
          }*/
          numberNode = stack.pop();
        }
        return numberNode;
    }
    @Override
    public Integer visitCuerpo3(Pl2compilerParser.Cuerpo3Context ctx)
    {
      ArrayList<Pl2compilerParser.LlamarfuncionContext> listLlamadas = new ArrayList<Pl2compilerParser.LlamarfuncionContext>(ctx.llamarfuncion());
      ArrayList<Pl2compilerParser.AsignacionContext> listaAsignaciones = new ArrayList<Pl2compilerParser.AsignacionContext>(ctx.asignacion());
      int numberNode = 0;

      for(int i = 0; i < listaAsignaciones.size(); i++)
      {
        stack.push((int)visit(listaAsignaciones.get(i)));
      }
      numberNode = stack.getLast();
      /*for(int i = 0; i < listaAsignaciones.size(); i++)
      {
        if(i == 0)
        {
          numberNode = stack.pop();
        }
        else
        {
          stack.pop();
        }
      }*/

      if(listLlamadas.size() != 0)
      {
        //stack.push(numberNode);
        for(int i = 0; i < listLlamadas.size(); i++)//Introduce en una pila los nodos que se han utilizado como última posición de una secuencia de una llamada
        {
          if(listLlamadas.get(i).llamadafuncion() == null) //No es una llamada a función
          {
            stack.push((int)visit(listLlamadas.get(i)));
          }
          else
          {

            stack.push((int)visit(listLlamadas.get(i)));
          }
        }
        /*for(int i = 0; i < listLlamadas.size(); i++) //Salva solo la última posición de las secuencias de llamadas realizadas
        {
          if(listLlamadas.get(i).llamadafuncion() == null) //No es una llamada
          {
            if(i == 0)
            {
              numberNode = stack.pop();
            }
            else
            {
              stack.pop();
            }
          }
          else
          {
            stack.pop();
          }
        }*/
        numberNode = stack.pop();
      }
      return numberNode;
    }
    @Override
    public Integer visitLlamarfuncion(Pl2compilerParser.LlamarfuncionContext ctx)
    {
      int lastNodeSequence = stack.pop();
        if(ctx.llamadafuncion() != null)
        {
          visit(ctx.llamadafuncion());
        }

        if(ctx.condicionales() != null)
        {
          lastNodeSequence = (int)visit(ctx.condicionales());
        }
        else if(ctx.funcionwhile() != null)
        {
          lastNodeSequence = (int)visit(ctx.funcionwhile());
        }
        else if(ctx.funcionfor() != null)
        {
          lastNodeSequence = (int)visit(ctx.funcionfor());
        }
        return lastNodeSequence;
    }

    @Override
    public Integer visitLlamadafuncion(Pl2compilerParser.LlamadafuncionContext ctx) //Realiza un camino secuencial
    {
      int actualNode = 0;
      actualNode = listNumberNode.size();
      listNumberNode.add(listNumberNode.size());
      ArrayList<Integer> listNodes = new ArrayList<Integer>();
      listNodes.add(actualNode);

      if(stack.size() != 0)
      {
        symbolTable.addNode(stack.pop(), listNodes);
      }
      else
      {
        symbolTable.addNode(0, listNodes); //Es el primer hijo con respecto a la creación de la función
      }

      stack.push(actualNode);
      isFunction(ctx);
      return actualNode;
    }
    @Override
    public Integer visitCondicionales(Pl2compilerParser.CondicionalesContext ctx)
    {
        ArrayList<Integer> listNodes = new ArrayList<Integer>(); //Para almacenar los nodos a los que se va a partir del nodo actual
        ArrayList<Integer> listPreviousNodes = new ArrayList<Integer>(); // Para realizar la unión con el nodo anterior si no se ha realizado que es el que lo ha invocado
        int actualNode = 0;
        actualNode = listNumberNode.size(); //Nº del nodo con el que vamos a trabajar en esta función

        int lastNodeSequence;
        listPreviousNodes.add(actualNode);
        if(stack.size() != 0)
        {
          lastNodeSequence = stack.getLast();
        }
        else
        {
          lastNodeSequence = 0;
        }
        symbolTable.addNode(lastNodeSequence, listPreviousNodes); //Puede que venga de terminar el codigo de otra llamada
        //System.out.println("ACTUAL NODE DFSAÑLKJFDÑLKAJDÑLKAJDSÑLKJDD: " + actualNode + " " + lastNodeSequence);
        //System.out.println("COCO1 " + listPreviousNodes.size());
        listNumberNode.add(listNumberNode.size());   //Incluir a la lista de nodos usados para el nodo actual
        listNodes.add(actualNode+1);      //Incluir el nodo de la condición if a la lista de nodos a los que va el nodo actual
        listNumberNode.add(listNumberNode.size()); //Incluir a la lista de nodos usados el que va a usarse para la condición if

        stack.push(actualNode + 1);
        //System.out.println("COCO1.1 " + listPreviousNodes.size());
        stack.push((int)visit(ctx.condicionalif())); //Posición de la último nodo de la secuencia de condiciones
        lastNodeSequence = stack.getLast();
        //System.out.println("COCO2 " + listPreviousNodes.size());

        if(ctx.condicionalelse() != null)
        {
          listNodes.add(listNumberNode.size());      //Incluir el nodo de la condición else a la lista de nodos a los que va el nodo actual
          listNumberNode.add(listNumberNode.size()); //Incluir a la lista de nodos usados el que va a usarse para la condición condicondicionalelse
          lastNodeSequence = (int) visit(ctx.condicionalelse());
          //System.out.println("COCO3 " + listPreviousNodes.size());
        }
        else
        {
          listNumberNode.add(listNumberNode.size()); //Hay que tener en cuenta cuando solo tenemos una condición
          //System.out.println("COCO4 " + listPreviousNodes.size());
        }
        symbolTable.addNode(actualNode, listNodes); //Introducimos los datos del nodo actual con las direcciones a donde va
        /*for(int i = 0; i < listPreviousNodes.size(); i++)
        {
          System.out.println("COCO//" + listPreviousNodes.get(i));
        }*/
        //System.out.println("COCO5 " + listPreviousNodes.size());
        return lastNodeSequence; //Utilizarlo para situaciones con bucles
    }

    @Override
    public Integer visitCondicionalif(Pl2compilerParser.CondicionalifContext ctx)
    {
        int actualNode = stack.pop();
        //System.out.println("READYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY: " + actualNode);
        ArrayList<Integer> listNodes = new ArrayList<Integer>(); //Para almacenar los nodos a los que se va a partir del nodo actual
        ArrayList<Integer> listLastNode = new ArrayList<Integer>(); //Para almacenar los nodos para el último nodo de la condición
        ArrayList<Pl2compilerParser.CondicionContext> listCondiciones = new ArrayList<Pl2compilerParser.CondicionContext>(ctx.condicion());
        int lastPosNodeSecuenceStudied = actualNode; //Proporciona el último nodo del que viene la secuencia
        listNodes.add(listNumberNode.size());
        listNumberNode.add(listNumberNode.size());
        //listNumberNode.add(actualNode + 1);
        //listNodes.add(actualNode + 1);
        symbolTable.addNode(actualNode, listNodes);
        stack.push(actualNode+1);
        int counter = 0;
        boolean verificar = false;
        while(!verificar && counter < listCondiciones.size())//Se va a comprobar que no ha recursividad con respecto a la función que se está creando
        {
          verificar = (boolean) visit(listCondiciones.get(counter));
          counter++;
        }
        //stack.pop();

        if(ctx.cuerpo2() != null)
        {
          lastPosNodeSecuenceStudied = (int)visit(ctx.cuerpo2());
        }
        else if(ctx.cuerpo3() != null)
        {
          lastPosNodeSecuenceStudied = (int)visit(ctx.cuerpo3());
        }
        else if(ctx.cuerpo() != null)
        {
          lastPosNodeSecuenceStudied = (int)visit(ctx.cuerpo());
        }
        stack.pop();
        listLastNode.add(listNumberNode.size()); //Añade el nodo estudiado que se encuentra tras finalizar la condición if
        listNumberNode.add(listNumberNode.size()); //Añade el nodo en el que se termina la condición if
        symbolTable.addNode(lastPosNodeSecuenceStudied, listLastNode); //Introduce en la tabla de símbolos la entrada de cierre de condición if

        return lastPosNodeSecuenceStudied + 1; //Retorna el número del nodo del que termina la condición
    }

    @Override
    public Boolean visitCondicion(Pl2compilerParser.CondicionContext ctx)
    {
      return (boolean) visit(ctx.expresionlogica());
    }

    @Override
    public Boolean visitExpresionlogica(Pl2compilerParser.ExpresionlogicaContext ctx)
    {
      boolean verificar = false;
      ArrayList<Pl2compilerParser.ExpresionlogicaContext> listaExpresionesLogicas = new ArrayList<Pl2compilerParser.ExpresionlogicaContext>(ctx.expresionlogica());
      int counter = 0;
      while(!verificar && counter < listaExpresionesLogicas.size())
      {
        verificar = (boolean)visit(listaExpresionesLogicas.get(counter));
        counter++;
      }
      if(!verificar)
      {
        ArrayList<Pl2compilerParser.ExprContext> listaExpresiones = new ArrayList<Pl2compilerParser.ExprContext>(ctx.expr());
        counter = 0;
        while(!verificar && counter < listaExpresiones.size())
        {
          verificar = (boolean)visit(listaExpresiones.get(counter));
          counter++;
        }

      }
      return verificar;
    }

    @Override
    public Boolean visitExpr(Pl2compilerParser.ExprContext ctx)
    {
      boolean verificar = false;
      if(ctx.llamadafuncion() != null)
      {
        visit(ctx.llamadafuncion());
        verificar = isFunction(ctx.llamadafuncion());
      }
      if(!verificar)
      {
        int counter = 0;
        ArrayList<Pl2compilerParser.ExprContext> listaExpresiones = new ArrayList<Pl2compilerParser.ExprContext>(ctx.expr());
        while(!verificar && counter < listaExpresiones.size())
        {
          verificar = (boolean)visit(listaExpresiones.get(counter));
          counter++;
        }
      }

      return verificar;
    }

    public Boolean isFunction(Pl2compilerParser.LlamadafuncionContext ctx)
    {
      boolean verificar = false;
      String nombreFuncion = "function ";
      int numParametros = 0;
      if(ctx.nombrefuncion() != null) //Solo nos interesa cuando es distinto de main
      {
          nombreFuncion += ctx.nombrefuncion().ID().getText() + "()";
          if(ctx.parametros() != null)
          {
            ArrayList<Pl2compilerParser.ParametroContext> listaParametros = new ArrayList<Pl2compilerParser.ParametroContext>(ctx.parametros().parametro());
            numParametros = listaParametros.size();
            if(nameFunction.contains(nombreFuncion) && numParametros == numParametersFunction) //Se comprueba si hay una llamada recursiva
            {
              ArrayList<Integer> listaNodos = new ArrayList<Integer>();
              listaNodos.add(0); //Introduce el nodo que tenía la recursividad
              symbolTable.addNode(stack.pop(), listaNodos); //Introduce el camino del nodo en el que se hace la llamada recursiva al nodo inicial de creación de la función
              verificar = true;
            }
          }
      }
      return verificar;
    }

    @Override
    public Integer visitCondicionalelse(Pl2compilerParser.CondicionalelseContext ctx)
    {
        int actualNode = 0;
        actualNode = listNumberNode.get(listNumberNode.size()-1); //Puesto que se ha introducido en visitCondicionales
        ArrayList<Integer> listNodes = new ArrayList<Integer>(); //Para almacenar los nodos a los que se va a partir del nodo actual
        int lastPosNodeSecuenceStudied = actualNode;

        listNumberNode.add(listNumberNode.size());
        //listNumberNode.add(actualNode + 1);
        //listNodes.add(actualNode + 1);
        symbolTable.addNode(actualNode, listNodes);
        stack.push(actualNode + 1);

        if(ctx.cuerpo2() != null)
        {
          lastPosNodeSecuenceStudied = (int) visit(ctx.cuerpo2());
        }
        else if(ctx.cuerpo3() != null)
        {
          lastPosNodeSecuenceStudied = (int) visit(ctx.cuerpo3());
        }
        else if(ctx.cuerpo() != null)
        {
          lastPosNodeSecuenceStudied = (int) visit(ctx.cuerpo());
        }
        listNodes = new ArrayList<Integer>();
        listNodes.add(stack.getLast()); //Añade el nodo en el que se termina la condición else y se une con el nodo donde ya ha terminado la condición del if
        //symbolTable.addNode(lastPosNodeSecuenceStudied, listNodes); //Introduce en la tabla de símbolos la entrada de cierre de condición if
        symbolTable.addNode(lastPosNodeSecuenceStudied, listNodes);
        return stack.pop(); //Devolve el nodo donde se conectaban las condiciones if y else
    }


    @Override
    public Integer visitFuncionwhile(Pl2compilerParser.FuncionwhileContext ctx)
    {
      ArrayList<Integer> listNodes = new ArrayList<Integer>(); //Para almacenar los nodos a los que se va a partir del nodo actual
      ArrayList<Integer> listPreviousNode = new ArrayList<Integer>(); // Para realizar la unión con el nodo anterior si no se ha realizado que es el que lo ha invocado
      ArrayList<Integer> listLastNodeWhile = new ArrayList<Integer>(); //Contiene el nodo del nodo padre que realiza el bucle while
      int actualNode = 0;
      actualNode = listNumberNode.size(); //Nº del nodo con el que vamos a trabajar en esta función
      int lastNodeSequence = actualNode; //Proporciona el último nodo del que viene la secuencia
      stack.push(actualNode);
      //System.out.println("ACTUAL NODEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEÑJFAÑLKDJFÑALKJDÑLKAJ" + actualNode);
      boolean verificar = false;
      if(ctx.expr() != null)//Se va a comprobar que no ha recursividad con respecto a la función que se está creando
      {
        verificar = (boolean) visit(ctx.expr());
        lastNodeSequence = stack.pop();
        System.out.println("Last NODEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE " + lastNodeSequence);
      }
      if(!verificar)
      {
        if(ctx.expresionlogica() != null)//Se va a comprobar que no ha recursividad con respecto a la función que se está creando
        {
          verificar = (boolean) visit(ctx.expresionlogica());
          lastNodeSequence = stack.pop();
          System.out.println("Last NODEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE2 " + lastNodeSequence);
        }
      }
      //stack.pop();

      listPreviousNode.add(actualNode);
      if(stack.size() != 0)
      {
        symbolTable.addNode(stack.getLast(), listPreviousNode); //Puede que venga de terminar el codigo de otra llamada
      }
      else
      {
        symbolTable.addNode(0, listPreviousNode); //Puede que venga de terminar el codigo de otra llamada
      }
      //listNumberNode.add(actualNode);   //Incluir a la lista de nodos usados para el nodo actual
      //listNumberNode.add(actualNode+1); //Incluir a la lista de nodos usados el que va a usarse para el cuerpo del bucle
      listNumberNode.add(listNumberNode.size());//Incluir a la lista de nodos usados para el nodo actual
      listNodes.add(listNumberNode.size());
      listNumberNode.add(listNumberNode.size());//Incluir a la lista de nodos usados el que va a usarse para el cuerpo del bucle

      //listNumberNode.add(actualNode + 1);
      //listNodes.add(actualNode + 1);
      //listNodes.add(actualNode+1);      //Incluir el nodo de la condición if a la lista de nodos a los que va el nodo actual

      if(ctx.cuerpo() != null)
      {
        stack.push((int)visit(ctx.cuerpo())); //Posición de la último nodo de la secuencia del cuerpo
      }
      else if(ctx.cuerpo2() != null)
      {
        stack.push((int)visit(ctx.cuerpo2())); //Posición de la último nodo de la secuencia del cuerpo2
      }
      else if(ctx.cuerpo3() != null)
      {
        stack.push((int)visit(ctx.cuerpo3())); //Posición de la último nodo de la secuencia del cuerpo3
      }

      lastNodeSequence = stack.pop();
      listLastNodeWhile.add(actualNode);
      symbolTable.addNode(lastNodeSequence, listLastNodeWhile);
      lastNodeSequence = listNumberNode.size();
      listNodes.add(listNumberNode.size());
      symbolTable.addNode(actualNode, listNodes); //Incluye los nodos hijos del nodo padre actual
      return lastNodeSequence; //Utilizarlo para situaciones con bucles
    }
    @Override
    public Integer visitFuncionfor(Pl2compilerParser.FuncionforContext ctx)
    {
      ArrayList<Integer> listNodes = new ArrayList<Integer>(); //Para almacenar los nodos a los que se va a partir del nodo actual
      ArrayList<Integer> listPreviousNode = new ArrayList<Integer>(); // Para realizar la unión con el nodo anterior si no se ha realizado que es el que lo ha invocado
      ArrayList<Integer> listLastNodeFor = new ArrayList<Integer>(); //Contiene el nodo del nodo padre que realiza el bucle for
      int actualNode = 0;
      actualNode = listNumberNode.size(); //Nº del nodo con el que vamos a trabajar en esta función
      int lastNodeSequence;
      listPreviousNode.add(actualNode);
      if(stack.size() != 0)
      {
        symbolTable.addNode(stack.getLast(), listPreviousNode); //Puede que venga de terminar el codigo de otra llamada
      }
      else
      {
        symbolTable.addNode(0, listPreviousNode); //Puede que venga de terminar el codigo de otra llamada
      }

      //listNumberNode.add(actualNode);   //Incluir a la lista de nodos usados para el nodo actual
      //listNumberNode.add(actualNode+1); //Incluir a la lista de nodos usados el que va a usarse para el cuerpo del bucle
      listNodes.add(listNumberNode.size());//Incluir a la lista de nodos usados para el nodo actual
      listNodes.add(listNumberNode.size());//Incluir a la lista de nodos usados el que va a usarse para el cuerpo del bucle
      listNumberNode.add(listNumberNode.size());
      //listNumberNode.add(actualNode + 1);
      //listNodes.add(actualNode + 1);
      symbolTable.addNode(actualNode, listNodes);

      listNodes = new ArrayList<Integer>();
      actualNode++;
      listNodes.add(listNumberNode.size()); //Incluir a la lista de nodos usados el que va a usarse para el cuerpo del bucle


      if(ctx.cuerpo() != null)
      {
        stack.push((int)visit(ctx.cuerpo())); //Posición de la último nodo de la secuencia del cuerpo
      }
      else if(ctx.cuerpo2() != null)
      {
        stack.push((int)visit(ctx.cuerpo2())); //Posición de la último nodo de la secuencia del cuerpo2
      }
      else if(ctx.cuerpo3() != null)
      {
        stack.push((int)visit(ctx.cuerpo3())); //Posición de la último nodo de la secuencia del cuerpo3
      }

      lastNodeSequence = stack.pop();
      listLastNodeFor.add(actualNode);
      symbolTable.addNode(lastNodeSequence, listLastNodeFor);
      lastNodeSequence = listNumberNode.size();
      listNodes.add(listNumberNode.size());
      symbolTable.addNode(actualNode, listNodes); //Incluye los nodos hijos del nodo padre actual

      return lastNodeSequence; //Utilizarlo para situaciones con bucles
    }

    @Override
    public Integer visitCodigo(Pl2compilerParser.CodigoContext ctx)
    {
      ArrayList<Pl2compilerParser.LlamarfuncionContext> listLlamadas = new ArrayList<Pl2compilerParser.LlamarfuncionContext>(ctx.llamarfuncion());
      ArrayList<Pl2compilerParser.AsignacionContext> listaAsignaciones = new ArrayList<Pl2compilerParser.AsignacionContext>(ctx.asignacion());
      int numberNode = 0;

      for(int i = 0; i < listaAsignaciones.size(); i++)
      {
        stack.push((int)visit(listaAsignaciones.get(i)));
      }
      /*for(int i = 0; i < listaAsignaciones.size(); i++)
      {
        if(i == 0)
        {
          numberNode = stack.pop();
        }
        else
        {
          stack.pop();
        }
      }*/
      numberNode = stack.getLast();

      if(listLlamadas.size() != 0)
      {
        //stack.push(numberNode);
        for(int i = 0; i < listLlamadas.size(); i++)//Introduce en una pila los nodos que se han utilizado como última posición de una secuencia de una llamada
        {
          if(listLlamadas.get(i).llamadafuncion() == null) //No es una llamada a función
          {
            stack.push((int)visit(listLlamadas.get(i)));
          }
          else
          {

            stack.push((int)visit(listLlamadas.get(i)));
          }
        }
        /*for(int i = 0; i < listLlamadas.size(); i++) //Salva solo la última posición de las secuencias de llamadas realizadas
        {
          if(listLlamadas.get(i).llamadafuncion() == null) //No es una llamada
          {
            if(i == 0)
            {
              numberNode = stack.pop();
            }
            else
            {
              stack.pop();
            }
          }
          else
          {
            stack.pop();
          }
        }*/
        numberNode = stack.pop();
      }
      if(ctx.devolver() != null)
        {
          if(ctx.asignacion().size() != 0 || ctx.llamarfuncion().size() != 0)
          {
            stack.push(numberNode);
            listNumberNode.add(listNumberNode.size());
          }
          else
          {
            stack.push(numberNode);
          }
          numberNode = (int) visit(ctx.devolver());
        }
        return numberNode;
    }

    @Override
    public Integer visitAsignacion(Pl2compilerParser.AsignacionContext ctx)
    {
      int actualNode = 0;
      actualNode = listNumberNode.size();
      //System.out.println("FUNCIONAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA: " + actualNode);
      ArrayList<Integer> listNodes = new ArrayList<Integer>(); //Para almacenar los nodos a los que se va a partir del nodo actual
      ArrayList<Integer> listPreviousNode = new ArrayList<Integer>(); //Para almacenar los nodos del nodo anterior
      ArrayList<Integer> listLastNode = new ArrayList<Integer>(); //Para almacenar los nodos para el último nodo de la condición
      ArrayList<Pl2compilerParser.SeparadoroperadoresContext> listaComas = new ArrayList<Pl2compilerParser.SeparadoroperadoresContext>(ctx.separadoroperadores());

      listNumberNode.add(listNumberNode.size());
      listPreviousNode.add(actualNode);
      if(stack.size() != 0)
      {
        symbolTable.addNode(stack.pop(), listPreviousNode);
      }
      else
      {
        symbolTable.addNode(0, listPreviousNode); //Es el primer hijo con respecto a la creación de la función
      }
      if(listaComas.size() != 0)
      {
        for(int i = 0; i < listaComas.size() + 1; i++) //Para cada una de las variables declaradas
        {
          listNodes.add(listNumberNode.size());
          listNumberNode.add(listNumberNode.size());
          symbolTable.addNode(actualNode, listNodes);
          listNodes = new ArrayList<Integer>();
          actualNode++;
        }
      }
      else
      {
        if(ctx.expr() != null)
        {
          if(ctx.expr().operadoraritmeticosuma() != null || ctx.expr().operadoraritmeticoresta() != null || ctx.expr().operadoraritmeticoproducto() != null || ctx.expr().operadoraritmeticodivision() != null)
          {
            stack.push(actualNode);
            isCadena(ctx.expr());
          }
        }
      }
      return actualNode;
    }


    public Boolean isCadena(Pl2compilerParser.ExprContext ctx)
    {
      ArrayList<Pl2compilerParser.ExprContext> listaExpresiones = new ArrayList<Pl2compilerParser.ExprContext>(ctx.expr());
      boolean verificar = false;
      int i = 0;
      if(ctx.llamadafuncion() != null)
      {
        verificar = isFunction(ctx.llamadafuncion());
        i++;
      }
      if(!verificar)
      {
        i = 0;
        while (!verificar && i < listaExpresiones.size())
        {
          verificar = isCadena(listaExpresiones.get(i));
          i++;
        }
      }

      return verificar;
    }

    /*public Boolean isRecursivo(Pl2compilerParser.LlamarfuncionContext ctx)
    {
      boolean verificar = false;
      String nombreFuncion = "function ";
      int numParametros = 0;
      if(ctx.nombrefuncion() != null) //Solo nos interesa cuando es distinto de main
      {
          nombreFuncion += ctx.nombrefuncion().ID().getText() + "()";
          if(ctx.parametros() != null)
          {
            ArrayList<Pl2compilerParser.ParametroContext> listaParametros = new ArrayList<Pl2compilerParser.ParametroContext>(ctx.parametros().parametro());
            numParametros = listaParametros.size();
            if(nameFunction.contains(nombreFuncion) && numParametros == numParametersFunction) //Se comprueba si hay una llamada recursiva
            {
              ArrayList<Integer> listaNodos = new ArrayList<Integer>();
              listaNodos.add(0); //Introduce el nodo que tenía la recursividad
              symbolTable.addNode(stack.pop(), listaNodos); //Introduce el camino del nodo en el que se hace la llamada recursiva al nodo inicial de creación de la función
              verificar = true;
            }
          }
      }
      return verificar;

    }*/

    @Override
    public Integer visitDevolver(Pl2compilerParser.DevolverContext ctx)
    {
        int lastNodeSequence = stack.pop();
        int actualNode = listNumberNode.size();
        ArrayList<Integer>listPreviousNodes = new ArrayList<Integer>();
        //ArrayList<Integer>listNodes = new ArrayList<Integer>();
        listNumberNode.add(listNumberNode.size());
        listPreviousNodes.add(actualNode);
        //System.out.println("COME ON ÑLKFDSAJALKDSJÑALKDJFÑLAKJFLSÑDDSDÑDJLÑK: " + lastNodeSequence + " " + actualNode);
        symbolTable.addNode(lastNodeSequence, listPreviousNodes);
        stack.push(actualNode);
        if(ctx.llamadafuncion() != null)
        {
          lastNodeSequence = (int) visit(ctx.llamadafuncion());
        }
        else if(ctx.expr() != null)
        {
          visit(ctx.expr());
        }

        return lastNodeSequence;
    }
}
