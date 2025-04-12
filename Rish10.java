package Consistent;
import java.util.*;
class Rish10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// check if a number is a perfect number
		int n = sc.nextInt();
		int num = n;
		int sum = 0;
		int i = 1;
		while(i<=n/2)
		{
			if(num%i==0)
			{
				sum = sum+i;
			}
			i++;
		}
		if(sum==n)
		{
			System.out.print("perfect Number");
		}
		else
		{
			System.out.print("Not a perfect Number");
		}
	}
}
