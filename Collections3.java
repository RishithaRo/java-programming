import java.util.*;
public class Collections3
{
    public static void main(String args[])
    {
        Vector<Integer> ob = new Vector<Integer>();
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
