//Reverse an array without using a second array.
import java.util.*;
public class Practiceex2
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
		    arr[i] = sc.nextInt();
		}
		int first = 0;
		int last = size-1;
		while(first<=((size-1)/2)) {
		    int temp = arr[first];
		    arr[first] = arr[last];
		    arr[last] = temp;
		    first++;
		    last--;
		}
		for(int i=0;i<arr.length;i++) {
		    System.out.print(arr[i]+" ");
		}
	}
}
