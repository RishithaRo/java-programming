// Hybrid Inheritance
/* procedure:-- 
Hybrid inheritance is the combination of hierarchical inheritance & multiple inheritance
As the multiple inheritance is not supported by java, 
This hybrid inheritance is achieved as the 
combination of "Hierarchical inheritance & multi-level inheritance"

*/

import java.util.*;
public class Inheritance5
{
    public static void main(String args[])
    {
        fourth_class ob1 = new fourth_class();
        ob1.display1();
        ob1.display2();
        ob1.display4();
        System.out.println();
        third_class ob2 = new third_class();
        ob2.display3();
        ob2.display1();
    }
}

class first_class
{
    void display1()
    {
        System.out.println("In first_class");
    }
}

class second_class extends first_class
{
    void display2()
    {
        System.out.println("In second_class");
    }

}

class third_class extends first_class
{
    void display3()
    {
        System.out.println("In third_class");
    }
}

class fourth_class extends second_class
{
    void display4()
    {
        System.out.println("In fourth_class");
    }
}
