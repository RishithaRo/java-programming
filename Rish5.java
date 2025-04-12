package Consistent;
import java.util.*;
class Rish5 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// count number of digits in a number
		int n = sc.nextInt();
		int count = 0;
		while(n>0)
		{
			count++;
			n/=10;
		}
		System.out.println(count);
	}
}
