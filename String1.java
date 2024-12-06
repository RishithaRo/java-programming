// count the number of characters in a String
import java.util.*;
public class String1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        int i ,c=0;
        for(i=0;i<ch.length;i++)
        {
            if(ch[i] == ' ')
            {
                continue;
            }
            c++;
        }
        System.out.println(c);
    }
}
