package nov16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);
        integers.add(50);

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        integers.add(3,25);
        integers.remove(40);
        System.out.println(integers.contains(30));
        System.out.println(integers.get(3));
        integers.set(2,100);

        Iterator<Integer> i = integers.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

//    List<Integer> l = new ArrayList<>();
//    l.add(10);
//    l.add(20);
//    l.add(30);
//    l.add(40);
//    l.add(50);


}
