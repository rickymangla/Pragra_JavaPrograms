package nov9;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class PrintMain {
    public static void main(String[] args) {
        PrintInteger p = new PrintInteger(23);
        p.getDetails();
        PrintDouble p1 = new PrintDouble(23.34);
        p1.getDetails();
        PrintString p2 = new PrintString("hello");
        p2.getDetails();

        Print<Integer> p3 = new Print<Integer>(25);
        p3.getDetails();

        ArrayList<Object> al = new ArrayList();

        al.add(2);

        Integer a = (Integer) al.get(0);

        al.add(new Cat("kdkd"));

        //   Cat myCat=al.get(0);
        display("hello");

        List<Print> l = new ArrayList<>();

        l.add(new Print<String>("hello world"));

        Print s = (Print) l.get(0);

        System.out.println("value of s is: " + s);

    }

    private static <T> void display(T thing) {
        System.out.println(thing + " is ????");
    }
}
