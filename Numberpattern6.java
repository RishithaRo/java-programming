import java.util.*;
public class Numberpattern6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=i;j>0;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
