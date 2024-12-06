// To find the longest word in given string
import java.util.*;
public class String7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ch[] = s.split("\\s+");
        int len = ch.length;
        int max = ch[0].length();
        int val = 0;
        int i;
        for(i=0;i<len;i++)
        {
            if(ch[i].length() > max)
            {
                max = ch[i].length();
                val = i;
            }
        }
        System.out.println(ch[val]);
    }
}
