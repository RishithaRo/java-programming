// Write a program that creates a custom exception InvalidAgeException. Throw this exception if the entered age is less than 18.
import java.util.*;

class InvalidAgeException extends Exception
{
    InvalidAgeException()
    {
        super("Not a valid Age!!");
    }
}
public class Exceptional_handling1
{
    static void checkNumber(int num) throws InvalidAgeException
    {
        if(num<18)
        {
            throw new InvalidAgeException();
        }
        else
        {
            System.out.println("Valid age " + num);
        }
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try
        {
            checkNumber(n);
        }
        catch(InvalidAgeException e)
        {
            System.out.println("Exception occured :"+ e);
        }
    }
}
