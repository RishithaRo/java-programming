// Multi-level Inheritance
/*  procedure:--

 one class extends only one another class,It is called derived class.
 Now in multiple inheritance, 
 a class extends only one derived class.
 
 */
 
 class Inheritance2
 {
     public static void main(String args[])
     {
        terv ob = new terv();
        ob.display1();
        ob.display2();
        ob.display3();
     }
 }

class mec //parent class,super class of Elite,grand parent class of terv
{
    void display1()
    {
        System.out.println("display of mec");
    }
}

class Elite extends mec //child class,sub class of mec,Derived class,parent class of terv
{
    void display2()
    {
        System.out.println("display of Elite");
    }
}

class terv extends Elite // grand child class of mec,child,sub class of Elite
{
    void display3()
    {
        System.out.println("display of terv");
    }
}
