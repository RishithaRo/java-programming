import java.util.*;
public class Practiceex
{
	public static void main(String[] args) {
		/*
		Input: "Java is super easy"
        Output:
        is
        Java
        easy
        super*/
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split("\\s+");
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i].length()>arr[j].length()) {
                    //swap 
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
	}
}
