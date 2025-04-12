package Consistent;
import java.util.*;
class Rish3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int i=1;
		while(i<=n)
		{
			sum = sum+i;
			i++;
		}
		System.out.println(sum);
	}
}
// sum of n natural numbers
