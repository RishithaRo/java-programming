// Reverse a string entered by the user 
// method1
import java.util.*;
public class String2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        int i;
        for(i=len-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}

//method2
// Reverse a string entered by the user 
import java.util.*;
public class String2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "";
        int len = s.length();
        int i;
        for(i=len-1;i>=0;i--)
        {
            s1 = s1+s.charAt(i);
        }
        System.out.println(s1);
    }
}
