// without argument without return value
import java.util.*;
public class Method4
{
    public static void main(String args[])
    {
        add();
    }
    static void add()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println(c);
    }
}
