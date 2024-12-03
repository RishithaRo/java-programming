// write a program to declare an array and print the array.
import java.util.*;
public class Arrays1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int i,j;
        for(i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
