// with argument with return value
import java.util.*;
public class Method1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = add(a,b);
        System.out.print(sum);
    }
    static int add(int a,int b)
    {
        int c = a+b;
        return c;
    }
}
