public class Task4 {
    public static void main(String[] args) {
        System.out.println("Squer is the: " + square(5));
        System.out.println("Cube is: " + cube(3));
        System.out.println("Average of: " + average(10, 15, 5));
        System.out.println("Maximum of: " + max(10, 15));
    }

    public static int square(int num){
        return num * num;
    }

    public static int cube(int num){
        return num * num * num;
    }

    public static double average(int a, int b, int c){
        return (a + b + c)/3;
    }

    public static int max(int a, int b){
        int max;
        if(a > b)
            max = a;
        else
            max = b;
        return max;
    }
}
