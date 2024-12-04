// with arguments with return value
import java.util.*;
public class Method6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int c = add(sc,x);
        System.out.print(c);
    }
    static int add(Scanner s,int x)
    {
        int a = s.nextInt();
        int b = s.nextInt();
        int res = a+b+x;
        return res;
    }
}
