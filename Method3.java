// without argument with return value
import java.util.*;
public class Method3
{
    public static void main(String args[])
    {
        int res = add();
        System.out.print(res);
    }
    static int add()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = a+b;
        return res;
    }
}
