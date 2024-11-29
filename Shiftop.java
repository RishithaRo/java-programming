import java.util.*;
public class Shiftop
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a<<2;
        int c = a>>2;
        System.out.print(b+" "+c);
    }
}
