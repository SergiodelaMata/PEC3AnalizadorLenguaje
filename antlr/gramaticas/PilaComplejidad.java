import java.util.*;
import java.util.ArrayList;

public class PilaComplejidad
{
  private ArrayList<Integer> stack;

  public PilaComplejidad()
  {
    this.stack = new ArrayList<Integer>();
    this.stack.add(0); //Siempre va a empezar con el node 0
  }

  public int pop()
  {
    int number = this.stack.get(stack.size()-1);
    this.stack.remove(stack.size()-1);
    System.out.println("Salgo de la pila: " + number);
    System.out.println("Tamaño de la pila: " + stack.size());
    System.out.println("Pila: ");
    for(int i = 0; i < stack.size()-1; i++)
    {
      if(i != 0)
      {
        System.out.print(", ");
      }
      System.out.print(stack.get(i));
    }
    System.out.println("");
    return number;
  }

  public int getLast()
  {
    return this.stack.get(stack.size()-1);
  }

  public void push(int number)
  {
    System.out.println("Entro en la pila: " + number);
    System.out.println("Tamaño de la pila: " + stack.size());
    this.stack.add(number);
    System.out.println("Pila: ");
    for(int i = 0; i < stack.size(); i++)
    {
      if(i != 0)
      {
        System.out.print(", ");
      }
      System.out.print(stack.get(i));
    }
    System.out.println("");
  }

  public int size()
  {
    return stack.size();
  }

}
