import java.util.*;
public class Numberpattern2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
