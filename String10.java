// Find the most frequent Character in a String
import java.util.*;
public class String10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int freq[] = new int[500];
        int len = s.length();
        int i;
        for(i=0;i<len;i++)
        {
            if(s.charAt(i)==' ')
            {
                continue;
            }
            freq[s.charAt(i)]++;
        }
        int max = freq[s.charAt(0)];
        int val = 0;
        for(i=0;i<len;i++)
        {
            if(freq[s.charAt(i)]>max)
            {
                max = freq[s.charAt(i)];
                val = i;
            }
        }
        System.out.println(max);
        System.out.println(s.charAt(val));
    }
}
