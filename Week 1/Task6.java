import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int myInt = scanner.nextInt();

        System.out.print("Enter a float value: ");
        float myFloat = scanner.nextFloat();

        System.out.print("Enter a double value: ");
        double myDouble = scanner.nextDouble();

        System.out.println("\n--- Original Values ---");
        System.out.println("Integer: " + myInt);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);

        System.out.println("\n--- Implicit Type Casting (Widening) ---");
        float implicitFloat = myInt;
        double implicitDouble = myInt;
        System.out.println("Int (" + myInt + ") implicitly cast to Float: " + implicitFloat);
        System.out.println("Int (" + myInt + ") implicitly cast to Double: " + implicitDouble);

        System.out.println("\n--- Explicit Type Casting (Narrowing) ---");
        int explicitIntFromDouble = (int) myDouble;
        float explicitFloatFromDouble = (float) myDouble;
        int explicitIntFromFloat = (int) myFloat;
        
        System.out.println("Double (" + myDouble + ") explicitly cast to Int: " + explicitIntFromDouble);
        System.out.println("Double (" + myDouble + ") explicitly cast to Float: " + explicitFloatFromDouble);
        System.out.println("Float (" + myFloat + ") explicitly cast to Int: " + explicitIntFromFloat);

        scanner.close();
    }

}
