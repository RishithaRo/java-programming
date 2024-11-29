import java.util.Scanner;
public class Hint3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        float b = sc.nextFloat();
        System.out.printf("%.2f ",a); // It will round off the decimal places to 2 digits
        System.out.printf("%.2f",b);  // It will round off the decimal places to 2 digits
    }
}
