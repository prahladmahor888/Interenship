public class Task5 {
    public static void main(String[] args) {
        //Implicite typecasting Automatic convert small datatype to big datatype
        // byte->short->int->long->float->double

        System.out.println("EMPLECIT TYPECASTING");
        System.out.println("────────────────────────────────");
        int originalValue = 20;
        double autoConverted = originalValue;

        System.out.println("Original Value: " + originalValue);
        System.out.println("Autometic Converted Value int to double: " + autoConverted);
        System.out.println("────────────────────────────────");

        System.out.println("\nEXPLICIT TYPECASTING");
        System.out.println("────────────────────────────────");

        double originalDouble = 15.2;
        int convertedInt = (int) originalDouble;

        System.out.println("Original Double Befor Explicit typecasting: " + originalDouble);
        System.out.println("Converted Int After Explicit typecasting: " + convertedInt);
        System.out.println("\n────────────────────────────────");
    }
}
