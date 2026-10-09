import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isExit = true;
        while(isExit){
            System.out.println("1 Addition");
            System.out.println("2 Subtraction");
            System.out.println("3 Multiplication");
            System.out.println("4 Division");
            System.out.println("5 Modulus");
            System.out.println("6 Exit");
            System.out.print("Enter your Choise(1-6): ");
            int choise = sc.nextInt();

            if(choise < 6 && choise > 0){
                System.out.print("Enter First Value: ");
                double a = sc.nextDouble();
                System.out.print("Enter Second Value: ");
                double b = sc.nextDouble();

                switch (choise) {
                    case 1:
                        double sum = a + b;
                        System.out.println("\n\n────────────────────────────────");
                        System.out.println("Addition is: " + sum);
                        System.out.println("────────────────────────────────\n\n");
                        break;

                    case 2:
                        double sub = a - b;
                        System.out.println("\n\n────────────────────────────────");
                        System.out.println("Subtraction is: " + sub);
                        System.out.println("────────────────────────────────\n\n");
                        break;

                    case 3:
                        double mul = a * b;
                        System.out.println("\n\n────────────────────────────────");
                        System.out.println("Multiplication is: " + mul);
                        System.out.println("────────────────────────────────\n\n");
                        break;

                    case 4:
                        double div = a / b;
                        System.out.println("\n\n────────────────────────────────");
                        System.out.println("Division is: " + div);
                        System.out.println("────────────────────────────────\n\n");
                        break;

                    case 5:
                        double mod = a % b;
                        System.out.println("\n\n────────────────────────────────");
                        System.out.println("Modulus is: " + mod);
                        System.out.println("────────────────────────────────\n\n");
                        break;
                
                    default:
                        isExit = false;
                        break;
                }

            }else{
                break;
            }

        }            
        sc.close();
    }
}
