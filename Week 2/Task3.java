import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter second number: ");
        double b = sc.nextDouble();
        int choise;
        do{
            System.out.println("1 Addition");
            System.out.println("2 Subtraction");
            System.out.println("3 Multiplication");
            System.out.println("4 Division");
            System.out.println("5 Modulus");
            System.out.println("6 Exit");
            System.out.print("Enter your Choise(1-6): ");
            choise = sc.nextInt();
            
            switch (choise) {
                    case 1:
                        double sum = addtion(a, b);
                        System.out.println("\n\n────────────────────────────────");
                        System.out.println("Addition is: " + sum);
                        System.out.println("────────────────────────────────\n\n");
                        break;

                    case 2:
                        double sub = subtraction(a, b);
                        System.out.println("\n\n────────────────────────────────");
                        System.out.println("Subtraction is: " + sub);
                        System.out.println("────────────────────────────────\n\n");
                        break;

                    case 3:
                        double mul = multiplication(a, b);
                        System.out.println("\n\n────────────────────────────────");
                        System.out.println("Multiplication is: " + mul);
                        System.out.println("────────────────────────────────\n\n");
                        break;

                    case 4:
                        double div = divide(a, b);
                        System.out.println("\n\n────────────────────────────────");
                        System.out.println("Division is: " + div);
                        System.out.println("────────────────────────────────\n\n");
                        break;

                    case 5:
                        double mod = modulus(a, b);
                        System.out.println("\n\n────────────────────────────────");
                        System.out.println("Modulus is: " + mod);
                        System.out.println("────────────────────────────────\n\n");
                        break;
                
                    default:
                        break;
                }
        }while(choise < 6);
    }

    public static double addtion(double a, double b){
        double sum = a + b;
        return sum;
    }

    public static double subtraction(double a, double b){
        double sub = a - b;
        return sub;
    }
    public static double multiplication(double a, double b){
        double mul = a * b;
        return mul;
    }
    
    public static double divide(double a, double b){
        double div = a / b;
        return div;
    }

    public static double modulus(double a, double b){
        return a % b;
    }
    
}
