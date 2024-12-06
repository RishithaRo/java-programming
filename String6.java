// Remove the duplicate character from a string and print Resultant string
import java.util.*;
public class String6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "";
        int freq[] = new int[256];
        int len = s.length();
        int i;
        for(i=0;i<len;i++)
        {
            freq[s.charAt(i)]++;
        }
        for(i=0;i<len;i++)
        {
            if(freq[s.charAt(i)]>=1)
            {
                s1 = s1+s.charAt(i);
                freq[s.charAt(i)]=0;
            }
        }
        System.out.println(s1);
    }
}
