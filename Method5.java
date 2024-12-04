// without arguments without return value
import java.util.*;
public class Method5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        add(sc);
        // here sc is an object not an argument
    }
    static void add(Scanner s)
    {
        int a = s.nextInt();
        int b = s.nextInt();
        int c = a+b;
        System.out.print(c);
    }
}
