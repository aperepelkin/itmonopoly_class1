package lesson14;


import lesson14.Product.Factory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Product product = factory.create();

        class InnerMain {

        }

        InnerMain m = new InnerMain();
    }
}
