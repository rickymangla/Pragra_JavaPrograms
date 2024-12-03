package nov23;

import java.sql.Array;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class PracticeLambdaPrograms {

    public static void main(String[] args) {
        //    Write a Java program to implement a lambda expression to find the average length of strings in a list.
        //   averageLengthOfString((s) -> (s.length()));

        //  Write a Java program to implement a lambda expression to check if a list of strings are all uppercase or all lowercase or mixedcase.
        //  checkString();

        //  Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
        //  convertStringUpperCase((s)->(s.toUpperCase()));
        // convertStringLowerCase((s) -> (s.toLowerCase()));

        // Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
        //  evenOrOddNumber((i) -> (i % 2 == 0));

        // Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
        //  sortString();

        // Write a Java program to implement a lambda expression to concatenate two strings
        System.out.println(concatenateStrings("hello","world"));


    }

    static void averageLengthOfString(Function<String, Integer> f) {
        List<String> l = new ArrayList<>();
        l.add("hello");
        l.add("java");
        l.add("python");

        int total_length = 0;

        //  Function<String, Integer> f = (s) -> (s.length());


        for (String s : l) {
            int length = f.apply(s);
            //   int length = s.length();
            total_length = total_length + length;
        }
        //   Function<Integer,Double> f1=(i)->(total_length/l.size());
        double average_length = total_length / l.size();

        System.out.println("average length of string is: " + average_length);
    }

    static void checkString() {
        List<String> l = new ArrayList<>();
        l.add("hello");
        l.add("java");
        l.add("python");

        boolean upperCase = false;
        boolean lowerCase = false;
        boolean mixedCase = false;

        for (String s : l) {
            char c[] = s.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (Character.isUpperCase(c[i])) {
                    upperCase = true;
                } else if (Character.isLowerCase(c[i])) {
                    lowerCase = true;
                } else {
                    mixedCase = true;
                }
            }
        }

        if (upperCase) {
            System.out.println("list contains all uppercase");
        } else if (lowerCase) {
            System.out.println("list contains all lowercase");
        } else {
            System.out.println("list contains mixedcase");
        }
    }

    static void convertStringUpperCase(Function<String, String> f) {
        List<String> l = new ArrayList<>();
        l.add("java");
        l.add("python");
        l.add("ruby");
        l.add("selenium");

        List<String> l1 = new ArrayList<>();

        for (String s : l) {
            String s1 = f.apply(s);
            l1.add(s1);
        }

        System.out.println("after changing to uppercase: " + l1);

        //  Function<String,String>f=(s)->(s.toUpperCase());
    }

    static void convertStringLowerCase(Function<String, String> f) {
        List<String> l = new ArrayList<>();
        l.add("JAVA");
        l.add("PYTHON");
        l.add("RUBY");
        l.add("SELENIUM");

        List<String> l1 = new ArrayList<>();

        for (String s : l) {
            String s1 = f.apply(s);
            l1.add(s1);
        }

        System.out.println("after changing to lowercase: " + l1);

        //  Function<String,String>f=(s)->(s.toLowerCase());
    }

    static void evenOrOddNumber(Predicate<Integer> p) {
        List<Integer> l = new ArrayList();
        l.add(2);
        l.add(4);
        l.add(7);
        l.add(9);
        for (Integer i : l) {
            if (p.test(i)) {
                System.out.println(i + " is even number");
            } else {
                System.out.println(i + " is odd number");
            }
        }

        //   Predicate<Integer>p=(i)->(i%2==0);
    }

    static void sortString() {
        List<String> colors = Arrays.asList("red", "green", "blue", "black", "pink");

        //  Comparator<String> c=(s1,s2)->(s1.compareToIgnoreCase(s2));

        // Collections.sort(colors);
        // System.out.println("without using lambda expression: " + colors);

        //  colors.sort(c);

        colors.sort((s1, s2) -> (s1.compareToIgnoreCase(s2)));
        System.out.println("after using lambda expression: " + colors);
    }

    static String concatenateStrings(String s1, String s2) {
//        String s1 = "hello";
//        String s2 = "world";
//
        Function<String, String> f = (s) -> (s.concat(" " + s2));

        return f.apply(s1);
    }


}
