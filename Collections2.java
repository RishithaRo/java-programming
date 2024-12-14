import java.util.*;
public class Collections2
{
    public static void main(String args[])
    {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        ob.add(10);
        ob.add(20);
        ob.add(2);
        System.out.println(ob);
        for(int x: ob)
        {
            System.out.print(x+" ");
        }
    }
}
