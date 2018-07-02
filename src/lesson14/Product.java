package lesson14;

public class Product {

    private String name;

    private Product() {

    }

    public static class Factory {

        public Product create() {
            Product p = new Product();
            p.name = "Generated name";
            return p;
        }
    }
}
