public class Task5 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append("World!");
        System.out.println(stringBuilder);
        stringBuilder.insert(5, " ");
        System.out.println(stringBuilder);
        stringBuilder.replace(6, 13, "Prahlad");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}
