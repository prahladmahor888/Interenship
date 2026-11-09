
abstract class Shape{
    abstract void calculateArea();

    public void display(){
        System.out.println("Calculating Area for the Shape...");
    }
}
class Circle extends Shape{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override 
    public void calculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle with radius " + radius + " is: " + area);
    }
}

class Ractangle extends Shape{
    double length;
    double width;

    public Ractangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    @Override 
    public void calculateArea(){
        double area = length * width;
        System.out.println("Area of Rectangle with length " + length + " and width " + width + " is: " + area);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.display();
        circle.calculateArea();


        System.out.println("-------------------------");
        Ractangle ractangle = new Ractangle(501.65, 50);
        ractangle.display();
        ractangle.calculateArea();
    }
}