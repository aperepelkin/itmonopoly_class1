package lesson13.interfaces;

public interface Printer {
    String name = "PRINTER"; //public static final String name = "PRINTER";
    void print(Object obj);

    default void printWithName(Object obj) {
        print(name + obj.toString());
    }
}
