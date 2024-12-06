// Single Inheritance
// one class extends only one another class 

class Inheritance1
{
    public static void main(String args[])
    {
        //object is always created to the child class( Sub class )
        second_class ob = new second_class();
        ob.display1();
        ob.display2();
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
        System.out.println("In second class");
    }
}
