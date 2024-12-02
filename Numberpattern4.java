import java.util.*;
public class Numberpattern4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i>=j)
                {
                    System.out.print(j+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
