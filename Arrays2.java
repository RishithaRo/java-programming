// write a program to declare a 2 dimensional array and print the array.
import java.util.*;
public class Arrays2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[rows][col];
        int i,j;
        for(i=0;i<rows;i++)
        {
            for(j=0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<rows;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
