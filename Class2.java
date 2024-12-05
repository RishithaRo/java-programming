import java.util.*;
class mec 
{
    int a;
    String s;
}
class Class2
{
    public static void main(String args[])
    {
        mec ob1 = new mec();
        mec ob2 = new mec();
        int a = 5;
        String s = "Rishiro";
        ob1.a = 10;
        ob1.s = "rishi";
        ob2.a = 15;
        ob2.s = "rohith";
        System.out.println(a+" "+s);
        System.out.println(ob1.a+" "+ob1.s);
        System.out.println(ob2.a+" "+ob2.s);
    }
}
