package lesson13.interfaces;

public class Main {
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        printer.print("Print message");

        Console c = new Console();
        c.printer = new CrazyPrinter();
        c.add("Print message");
        c.add(688);
        c.add(98764.77);
    }
}
