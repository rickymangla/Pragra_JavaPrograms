package nov23;

import java.util.ArrayList;
import java.util.List;

public class PrinterMain {
    public static void main(String[] args) {
        Printer<String> p = (item) -> {
            System.out.println("printer brand is: " + item);
        };

        p.print("HP");

//        List<String> l = new ArrayList<>();
//        l.add("Amit");
//        l.add("Rahul");
//        l.add("Jeevan");
//        l.add("kevin");




    }
}
