// with argument without return value
import java.util.*;
public class Method2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        add(a,b);
    }
    static void add(int a,int b)
    {
        int c = a+b;
        System.out.println(c);
    }
}
