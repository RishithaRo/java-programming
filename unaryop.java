import java.util.*;
public class unaryop
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        a++;
        System.out.println("a++ "+ a);
        ++a;
        System.out.println("++a " + a);
        a--;
        System.out.println("a-- " + a);
        --a;
        System.out.println("--a " + a);
    }
}
