class Vehicle{
    public void start(){
        System.out.println("Vehical is started");
    }
}

class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Car is started");
    }
}

class Bike extends Vehicle{
    @Override
    public void start(){
        System.out.println("Bike is strted");
    }
}

public class Task5 {
    public static void main(String[] args) {
        // Method Overloading (Compile-time Polymorphism) 
        System.out.println("\n------------- Method Overloading-------------\n");
        System.out.println("Calucate two int value for sum : " + calculate(5, 8));
        System.out.println("Calulate two double value for sum : " + calculate(50.6, 15.8));
        System.out.println("Calculate three int value for sum : " + calculate(5, 18, 99));

        // Method Overriding (Runtime Polymorphism)
        System.out.println("\n-----------Method Overriding-----------\n");
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        Vehicle car = new Car();
        car.start();

        Vehicle bike = new Bike();
        bike.start();
    }

    public static int calculate(int a, int b){
        return a+b;
    }

    public static double calculate(double a, double b){
        return a+b;
    }

    public static int calculate(int a, int b, int c){
        return a+b+c;
    }
}
