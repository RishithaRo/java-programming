class Vehicle{
    void start(){
        System.out.println("Vehicle is starting");
    }
    void stop(){
        System.out.println("Vehicle is stopped");
    }
}

class Car extends Vehicle{
   
}
class Bike extends Vehicle {
    
}

class Main{
    public static void main(String[] args) {
        Car ob1 = new Car();
        Bike ob2 = new Bike();
        ob1.start();
        ob2.start();
        ob1.stop();
        ob2.stop();
    }
}
