package nov23;

import java.sql.Array;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PracticeLambdaPrograms {

    public static void main(String[] args) {
        //    Write a Java program to implement a lambda expression to find the average length of strings in a list.

//        List<String> words=Arrays.asList("hello","to","java");
        //  System.out.println(averageLengthOfString(words));

        //  Write a Java program to implement a lambda expression to check if a list of strings are all uppercase or all lowercase or mixedcase.
//        List<String> words = Arrays.asList("HELLO", "TO", "java");
//        boolean isAllUpperCase = checkCase(words, (s) -> s.equals(s.toUpperCase()));
//        System.out.println("result of uppercase: " + isAllUpperCase);
//
//        boolean isAllLowerCase = checkCase(words, (s) -> s.equals(s.toLowerCase()));
//        System.out.println("result of lowercase: " + isAllLowerCase);
//
//        boolean isMixedCase = !isAllUpperCase && !isAllLowerCase;
//        System.out.println("result of mixedcase: " + isMixedCase);

        // Write a Java program to implement a lambda expression to sort a list of objects based on a specific attribute.
        //sorting();

        // Write a Java program to implement a lambda expression to find the second largest and smallest element in an array.
        //  secondLargestNumber();

        // Write a Java program to implement a lambda expression to check if a given number is a perfect square
        // System.out.println("perfect Square result = " + perfectSquare(27, PracticeLambdaPrograms::perfectSquareHelper));

        // Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.
//        List<String> l = Arrays.asList("hello", "to", "java");
//        System.out.println("longestString(l) = " + longestString(l));
//        System.out.println("shortestString(l) = " + shortestString(l));

        // Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.
//        List<String> words = Arrays.asList("hello", "to", "java");
//        System.out.println("word Verification = " +

        // Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.
//        List<Integer> numbersList = Arrays.asList(2, 4, 6, 3, 7);
//        System.out.println("sum of even number squares: " + sumOfEvenNumberSquares(numbersList, (i) -> i % 2 == 0));
//        System.out.println("sum of odd number squares: " + sumOfOddNumberSquares(numbersList, (i) -> i % 2 != 0));

        // Write a Java program to implement a lambda expression to check if a given string is a palindrome.
        //   System.out.println("palindromeString() = " + palindromeString("aja", PracticeLambdaPrograms::palindromeStringHelper));

        // Write a Java program to implement a lambda expression to count words in a sentence.
        // System.out.println(countWordsInSentence("welcome to java",PracticeLambdaPrograms::countWordsInSentenceHelper));


        // Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.
        List<Integer> l = Arrays.asList(3, 4, 5, 6);
        multiplyAndSumNumbers(l );

    }

    static double averageLengthOfString(List<String> words) {

        OptionalDouble average = words.stream().mapToInt(String::length).average();
        return average.orElseThrow(() -> new RuntimeException("error in finding the average"));

    }

    public static boolean checkCase(List<String> strings, Predicate<String> checkFunction) {
//        String firstString = strings.get(0);
//        String convertedString = convertFunction.apply(firstString);

        return strings.stream()
                .allMatch(s -> checkFunction.test(s));
    }

    public static void sorting() {
        List<StudentNew> l = Arrays.asList(new StudentNew("amit", 101, 'a'),
                new StudentNew("rahul", 102, 'b'),
                new StudentNew("ram", 103, 'c'));

        List<StudentNew> sortStuId = l.stream().sorted(Comparator.comparingInt((a) -> a.getStuId())).collect(Collectors.toList());
        System.out.println("sortStuId = " + sortStuId);

        List<StudentNew> sortStuName = l.stream().sorted((s1, s2) -> s1.getStuName().compareTo(s2.getStuName())).collect(Collectors.toList());
        System.out.println("sortStuName = " + sortStuName);
    }

    public static void secondLargestNumber() {
        List<Integer> l = Arrays.asList(3, 4, 1, 6, 3);

        List<Integer> sortedList = l.stream().distinct().sorted((n1, n2) -> n1 - n2).collect(Collectors.toList());
        System.out.println("sortedList = " + sortedList);
        System.out.println("second smallest number is: " + sortedList.get(1));

        List<Integer> sortedListNew = l.stream().distinct().sorted((n1, n2) -> n2 - n1).collect(Collectors.toList());
        System.out.println("sortedListNew = " + sortedListNew);
        System.out.println("second largest number is: " + sortedListNew.get(1));

    }

    public static boolean perfectSquare(int number, Predicate<Integer> p) {
//        Predicate<Integer> p = ((n) -> {
//            int sqrt = (int) Math.sqrt(n);
//            return sqrt*sqrt==n;
//        });
//
        // Predicate<Integer> p1 = (PracticeLambdaPrograms::perfectSquareHelper);

        return p.test(number);

    }

    public static boolean perfectSquareHelper(Integer number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    public static String longestString(List<String> list) {
        return list.stream().distinct().max((s1, s2) -> s1.length() - s2.length()).orElseThrow(() -> new RuntimeException("error in finding longest string"));
    }

    public static String shortestString(List<String> list) {
        return list.stream().distinct().min((s1, s2) -> s1.length() - s2.length()).orElseThrow(() -> new RuntimeException("error in finding longest string"));
    }

    public static boolean wordVerification(List<String> words, String wordVerified) {
        return words.stream().anyMatch((s) -> s.equals(wordVerified));

    }

    public static int sumOfEvenNumberSquares(List<Integer> numberList, Predicate<Integer> p) {

        return numberList.stream().filter((num) -> p.test(num)).mapToInt((num) -> num * num).sum();
    }

    public static int sumOfOddNumberSquares(List<Integer> numberList, Predicate<Integer> p) {

        return numberList.stream().filter((num) -> p.test(num)).mapToInt((num) -> num * num).sum();
    }

    public static boolean palindromeString(String s, Predicate<String> p) {
        return p.test(s);
    }

    public static boolean palindromeStringHelper(String input) {
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        return input.equals(reverse);
    }

    public static int countWordsInSentence(String s, Function<String, Integer> f) {
        return f.apply(s);
    }

    public static int countWordsInSentenceHelper(String s) {
        return s.split("[\\s]").length;
    }

    public static void multiplyAndSumNumbers(List<Integer> list) {

        Optional<Integer> reduce = list.stream().reduce((a, b) -> a * b);
        Integer multiplicationNumber = reduce.orElseThrow(() -> new RuntimeException("error in finding the product of numbers"));
        System.out.println("multiplicationNumber = " + multiplicationNumber);

        Optional<Integer> reduce1 = list.stream().reduce((x, y) -> x + y);
        Integer sumNumbers = reduce1.orElseThrow(() -> new RuntimeException("error in finding sum of numbers"));
        System.out.println("sumNumbers = " + sumNumbers);

    }

}

class StudentNew {
    private String stuName;
    private int stuId;
    private char stuGrade;

    public StudentNew(String stuName, int stuId, char stuGrade) {
        this.stuName = stuName;
        this.stuId = stuId;
        this.stuGrade = stuGrade;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public char getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(char stuGrade) {
        this.stuGrade = stuGrade;
    }

    @Override
    public String toString() {
        return "StudentNew{" +
                "stuName='" + stuName + '\'' +
                ", stuId=" + stuId +
                ", stuGrade=" + stuGrade +
                '}';
    }
}
