package lesson13.interfaces;

public class ConsolePrinter implements Printer {

    @Override
    public void print(Object obj) {
        if(obj != null)
            System.out.println(obj.toString());
    }
}
