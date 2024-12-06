//Inheritance
/*  Method overriding

if the same method is present in both the superclass and subclass, 
what will happen? 
In this case, the method in the subclass overrides the method in the superclass. 
This concept is known as method overriding in Java.
*/


class Method_overriding1
{
    public static void main(String args[])
    {
        mec ob1 = new mec();
        ob1.display();
    }
}

class terv  //super class 
{
    void display()
    {
        System.out.println("Hello terv");
    }
}

class mec extends terv  //subclass
{
    void display()
    {
        System.out.println("Hello mec");
    }
}
