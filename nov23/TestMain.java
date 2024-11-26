package nov23;

import java.util.function.Predicate;

public class TestMain {
    public static void main(String[] args) {

        Predicate<String> p = s -> (s.length() > 4);

//        Predicate<String>p1=(s1)->{
//            boolean s2=false;
//            if(s1.length()>4) {
//                s2=true;
//            }
//            return s2;
//        };
        System.out.println(p.test("Hello"));

//        Test5 t5 = (a, b) -> {
//            return a + b;
//        };
//        System.out.println("Sum of two integers is: " + t5.sum(5, 6));
//
//        D d = (input) -> {
//            boolean isEmpty = false;
//            if (input.length() == 0) {
//                isEmpty = true;
//            }
//            return isEmpty;
//        };
//
//        // D d1=input->input.length();
//
//
//        System.out.println("output of empty string: " + d.stringEmpty("hello"));
    }
}

@FunctionalInterface
interface D {
    boolean stringEmpty(String input);

    default void show() {
        System.out.println("this is sample method");
    }
}
