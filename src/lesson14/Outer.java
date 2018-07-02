package lesson14;

public class Outer {

    private int field;

    class Inner {
        {
            field = 4;
        }
    }

    static class Nested {

        public Nested() {
            Outer instance = new Outer();
            instance.field = 7;
        }
    }

    public Inner createInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer instance = new Outer();
        Inner inner = instance.new Inner();
    }
}
