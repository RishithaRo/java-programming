// Hierarchical inheritance
/* procedure:--

Same class is extended into different classes 
*/

class Inheritance3
{
    public static void main(String args[])
    {
        second_class ob = new second_class();
        ob.display1();
        ob.display2();
        System.out.println();
        third_class ob1 = new third_class();
        ob1.display1();
        ob1.display3();
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
        System.out.println("In Second_class");
    }
}
class third_class extends first_class
{
    void display3()
    {
        System.out.println("In Third class");
    }
}
