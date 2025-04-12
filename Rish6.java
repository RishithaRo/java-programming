package Consistent;
import java.util.*;
public class Rish6 {

	public static void main(String[] args) 
	{
		//check if a number is palindrome
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// By default sc.nextInt() ignores the leading zeros
		int num = n;
		int rev=0;
		while(num>0)
		{
			int r = num%10;
			rev = rev*10+r;
			num/=10;
		}
		if(rev==n)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
