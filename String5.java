// print the first non repeated character in the String
import java.util.*;
public class String5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int freq[] = new int[256];
        int len = s.length();
        int i;
        for(i=0;i<len;i++)
        {
            freq[s.charAt(i)]++;
        }
        for(i=0;i<len;i++)
        {
            if(freq[s.charAt(i)]==1)
            {
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
