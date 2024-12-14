import java.util.*;
public class Collections6 
{
  public static void main(String args[])
  {
    Vector<Integer> ob = new Vector<>();
    ob.add(23);
    ob.add(45);
    ob.add(374);
    System.out.println(ob);
    for(int x:ob)
    {
      System.out.print(x+" ");
    }
  }
}
