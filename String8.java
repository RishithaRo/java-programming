// Count vowels and consonants in a String
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        int len = ch.length;
        int i;
        int vow = 0;
        int cons = 0;
        for(i=0;i<len;i++)
        {
            if((ch[i]>=65 && ch[i]<=90) || (ch[i]>=97 && ch[i]<=122))
            {
                if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i] =='O' || ch[i]=='U' || ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
                {
                    vow++;
                }
                else{
                    cons++;
                }
            }
        }
        System.out.println("Vowels: "+vow);
        System.out.println("consonants: "+cons);
    }
}
