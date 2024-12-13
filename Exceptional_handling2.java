import java.util.*;

class Age extends Exception
{
    Age()
    {
        super("Access denied..!! Age is under 18");
    }
}

public class Exceptional_handling2
{
    static void checkAge(int age) throws Age
    {
        if(age<18)
        {
            throw new Age();
        }
        else
        {
            System.out.println("Access permitted..proceed...");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int age = sc.nextInt();
            checkAge(age);
        }
        catch(Age e)
        {
            System.out.println("Exception occured: "+ e);
        }
    }
}
