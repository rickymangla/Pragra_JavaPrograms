package nov23;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class PracticeFunctionalInterface {

    public static void main(String[] args) {
        // BiPredicate Interface example
        //  greaterNumber((i1, i2) -> i1 > i2, 10, 15);

        //BiConsumer Interface example
        //  print((name, age) -> System.out.println(name + "is" + " " + age + " years old"), "john ", 23);

        //BiFunction Interface example
       //
        // sumNumbers((i1, i2) -> i1 + i2, 10, 15);

        multiplyNumber();

    }

    public static void greaterNumber(BiPredicate<Integer, Integer> b, Integer i1, Integer i2) {
        System.out.println(b.test(i1, i2));
    }

    public static void print(BiConsumer<String, Integer> bi, String s1, Integer i) {
        bi.accept(s1, i);
    }

    public static void sumNumbers(BiFunction<Integer, Integer, Integer> bif, Integer i1, Integer i2) {
        System.out.println(bif.apply(i1, i2));
    }

    public static void multiplyNumber() {
        List<Integer> l = Arrays.asList(2, 4, 6);

        List<Integer> listNew = l.stream().map((i) -> i * 2).collect(Collectors.toList());
        listNew.forEach((i)-> System.out.println(i));

    }
}
