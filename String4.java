// Count the frequency of characters present in a string
import java.util.*;
public class String4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        int freq[] = new int[256];
        int i;
        for(i=0;i<len;i++)
        {
            freq[s.charAt(i)]++;
        }
        for(i=0;i<len;i++)
        {
            if(freq[s.charAt(i)]>=1)
            {
                System.out.println(s.charAt(i)+": "+freq[s.charAt(i)]);
                freq[s.charAt(i)] = 0;
            }
        }
    }
}
