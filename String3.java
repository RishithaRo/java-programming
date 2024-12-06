// Check if a string is palindrome or not
import java.util.*;
public class String3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = "";
        int len = s.length();
        int i;
        for(i=len-1;i>=0;i--)
        {
            s2 = s2+ s.charAt(i);
        }
        if(s.equals(s2))
        {
            System.out.println("Yes, its a palindrome");
        }
        else
        {
            System.out.println("No, its not a palindrome");
        }
    }
}
