package Consistent;
import java.util.*;
public class Rish8 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// print if it is amstrong num or not
		/* A num is said to be amstrong if all individual digits of 
		that num raised to the power of its length and then added 
		then if the result equals to actual num
		*/
		int len = 0;
		int num = n;
		int number = n;
		while(num>0)
		{
			len++;
			num/=10;
		}
		int sum = 0;
		while(n>0)
		{
			int r = n%10;
			int power = 1;
			int length = len;
			while(length>0)
			{
				power*=r;
				length--;
			}
			sum =sum+power;
			n/=10;
		}
		if(sum==number)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}
	}

}
