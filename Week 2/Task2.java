public class Task2{
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("All numbers 1 to 100: ");
        for(int i = 1; i<=100; i++){
            System.out.print(i + ", ");
            sum += i;
        }
        int even = 1;
        System.out.println("\nAll even numbers between 1 and 100: ");
        while(even <= 100){
            if(even % 2 == 0)
                System.out.print(even + ", ");
            even++;
        }
        int odd = 1;
        System.out.println("\nAll odd numbers between 1 and 100: ");
        do{
            if(odd % 2 != 0)
                System.out.print(odd + ", ");
            odd++;
        }while(odd <= 100);

        System.out.println("\nThe sum of numbers from 1 to 100: " + sum);

    
    }
}