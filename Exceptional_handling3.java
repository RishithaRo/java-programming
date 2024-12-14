public class Exceptional_handling3
{
    public static void main(String args[])
    {
        String s = null;
        try
        {
        System.out.println(s.length());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
