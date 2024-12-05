// Intialize the value of an object by method 
import java.util.*;
class car
{
    int price;
    int milage;
    void details(int cost,int mil)
    {
        price = cost;
        milage = mil;
    }
    void display()
    {
        System.out.println(price+" "+milage+"km/h");
    }
}

public class Class3
{
    public static void main(String args[])
    {
        car tesla = new car();
        tesla.details(100000,78);
        car audi = new car();
        audi.details(10000000,95);
        tesla.display();
        audi.display();
        
    }
}
