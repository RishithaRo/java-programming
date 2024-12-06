// Remove all spaces from a String
import java.util.*;
public class String9
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ch[] = s.split("\\s+");
        String s1 = "";
        int len = ch.length;
        int i;
        for(i=0;i<len;i++)
        {
            s1+=ch[i];
        }
        System.out.println(s1);
    }
}
