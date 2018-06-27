package lesson13.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Console {

    Printer printer;
    List<Object> objects = new ArrayList<>();

    public void add(Object obj) {
        printer.print(obj);
        objects.add(obj);
    }
}
