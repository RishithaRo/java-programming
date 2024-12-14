import java.util.*;
public class Collections1
{
    public static void main(String args[])
    {
        LinkedList<Integer> ob = new LinkedList<Integer>();
        ob.add(10);
        ob.add(20);
        ob.add(30);
        System.out.println(ob);
        for(int x: ob)
        {
            System.out.print(x+" ");
        }
    }
}
