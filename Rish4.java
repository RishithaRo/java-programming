package Consistent;
import java.util.*;
class Rish4 
{
	public static void main(String[] arfs)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0)
		{
			int r = n%10;
			System.out.print(r+" ");
			n/=10;
		}
	}
}
