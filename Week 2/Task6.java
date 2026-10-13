import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int[][] metrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int row = i+1;
            System.out.println("Enter " + row + " row elements: ");
            for (int j = 0; j < 3; j++) {
                metrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("Metrix is");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(metrix[i][j] + " ");
            }
            System.out.println("");
        }

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += metrix[i][j];
            }
        }

        System.out.println("Metrix Element sum: " + sum);
    }
}
