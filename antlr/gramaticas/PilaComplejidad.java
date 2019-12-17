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
    
    return number;
  }

  public int getLast()
  {
    return this.stack.get(stack.size()-1);
  }

  public void push(int number)
  {
    this.stack.add(number);    
  }

  public int size()
  {
    return stack.size();
  }

}
