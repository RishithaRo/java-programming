// Print a rectangular pattern of * with n rows and m columns.
import java.util.*;
public class Nestedloop1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=m;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
