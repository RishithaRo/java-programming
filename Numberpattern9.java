import java.util.*;
public class Numberpattern9
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i=n;i>0;i--)
        {
            for(j=n;j>0;j--)
            {
                if(i<=j)
                {
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
