public class Main {

    public static void main(String[] args) {
        int passportNumber = 777;

        {
            int var2 = 8;
            var2 = passportNumber;
            System.out.println(var2);

            int var3;
            var3 = 6;
            System.out.println(var3);

            boolean b1 = true, b2 = false, b3;
        }
        System.out.println("First Java program");
        System.out.println(1234);
        System.out.println(2134.8);
        System.out.println('c');
        System.out.println(true);
        System.out.println(false);
    }
}