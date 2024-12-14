import java.util.*;
public class Collections5 
{
  public static void main(String args[])
  {
    LinkedList<Integer> ob = new LinkedList<>();
    ob.add(10);
    ob.add(20);
    ob.add(30);
    System.out.println(ob);
    for(int x:ob)
    {
      System.out.print(x+" ");
    }
  }
}
