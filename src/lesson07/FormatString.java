package lesson07;

public class FormatString {
    public static void main(String[] args) {
        String formatted =
                String.format("Hello for %s from %s", "Andrew", "Java");
        System.out.println(formatted);
        System.out.printf("Hello for %s from %s", "Andrew", "Java");
        System.out.printf("Number %.4f of %10d", 6.88, 8);
    }
}
