package nov30;

import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeStreamsDemo {

    public static void main(String[] args) {

        // filterMethod();
        //streamDemo1();
        // filterNull();
        // filterObject();
        //convertUpperCase();
        //printLength();
        //numberMultiplication();
        // employeeSalary();

        //flatmap practice

        //  practiceFlatMap();
        // practiceFlatMap2();
        practiceFlatMap3();


    }

    static void filterMethod() {
        List<Integer> l = Arrays.asList(10, 15, 25, 30, 60);
        System.out.println("before filtering: " + l);
        List<Integer> evenNumber = new ArrayList<>();

        //first method in which filtered data is stored in new list
//        evenNumber = l.stream().filter((n) -> (n % 2 == 0)).collect(Collectors.toList());
//        System.out.println("after filtering the data: " + evenNumber);

        //second method to print the filtered list directly
        //  l.stream().filter((n)->(n%2==0)).forEach((n)->System.out.print(n + " "));

        //third method of printing the filtered list
        l.stream().filter((n) -> (n % 2 == 0)).forEach(System.out::println);

    }

    static void streamDemo1() {
        List<String> names = Arrays.asList("mississauga", "caledon", "brampton", "oakville", "northyork");
        names.stream().filter((s) -> (s.length() < 8)).map((s) -> s.toUpperCase()).forEach((s) -> System.out.println(s));

        //  names.stream().filter(new PracticeStreamsDemo()::stringLength).map(String::toUpperCase).forEach(System.out::println);

        names.stream().filter(PracticeStreamsDemo::stringLengthNew).map(String::toUpperCase).forEach(System.out::println);
    }

    public boolean stringLength(String s) {
        return s.length() < 8;
    }

    public static boolean stringLengthNew(String s) {
        return s.length() < 8;
    }

    static void filterNull() {
        List<String> l = Arrays.asList("amit", "rohit", null, "kevin", null, "rahul");
        //l.stream().filter((s) -> (s!=null)).forEach(System.out::println);

        List<String> l1 = l.stream().filter((s) -> (s != null)).collect(Collectors.toList());
        System.out.println("after removing null from list: " + l1);


    }

    static void filterObject() {
        List<Product> pr = new ArrayList<>();

        pr.add(new Product(1, "apple", 1400));
        pr.add(new Product(2, "dell", 500));
        pr.add(new Product(3, "lenovo", 1000));
        pr.add(new Product(4, "hp", 600));

        // List<Product> reqList = pr.stream().filter((e) -> (e.getPrice() < 800)).collect(Collectors.toList());
        pr.stream().filter((e) -> (e.getPrice() < 800)).forEach((e) -> System.out.println(e.getName()));


        // reqList.forEach((p)->System.out.println(p.getName()));

    }

    static void convertUpperCase() {
        List<String> l = Arrays.asList("hello", "to", "java");

        // l.stream().map((s)->(s.toUpperCase())).forEach((s)-> System.out.println(s));

        List<String> upperCaseList = l.stream().map(String::toUpperCase).collect(Collectors.toList());
        upperCaseList.forEach((s) -> System.out.println(s));
    }

    static void printLength() {
        List<String> l = Arrays.asList("hello", "to", "java");
        // l.stream().map((s)->(s.length())).forEach((i)-> System.out.println(i));
        List<Integer> listLength = l.stream().map(String::length).collect(Collectors.toList());
        listLength.forEach((i) -> System.out.println(i));
    }

    static void numberMultiplication() {
        List<Integer> l = Arrays.asList(2, 4, 6, 8);
        List<Integer> listNew = l.stream().map((i) -> (i * 3)).collect(Collectors.toList());
        listNew.forEach((i) -> System.out.println(i));
    }

    static void employeeSalary() {
        List<Employee> l = Arrays.asList(new Employee(101, "amit", 4500.50),
                new Employee(102, "rahul", 5000.00),
                new Employee(103, "prateek", 5500.50));

        // l.stream().filter((e)->(e.getSalary()>4800)).forEach((d)-> System.out.println(d));

        List<Double> listNew = l.stream().filter((e) -> (e.getSalary() > 4800)).map((e) -> e.getSalary()).collect(Collectors.toList());
        // List<Double> listNew = l.stream().filter((e) -> (e.getSalary() > 4800)).map(Employee::getSalary).collect(Collectors.toList());
        listNew.forEach((d) -> System.out.println(d));
    }

    static void practiceFlatMap() {
        List<Integer> l1 = Arrays.asList(1, 2);
        List<Integer> l2 = Arrays.asList(3, 4);
        List<Integer> l3 = Arrays.asList(5, 6);

        List<List<Integer>> l4 = Arrays.asList(l1, l2, l3);
//        List<Integer> finalList = l4.stream().flatMap((l) -> l.stream().map((i) -> (i + 10))).collect(Collectors.toList());
//        finalList.forEach((i) -> System.out.println(i));

        // l4.stream().flatMap((e)->(e.stream())).map((u)->(u+10)).forEach(System.out::println);

    }

    static void practiceFlatMap2() {
        List<String> team1 = Arrays.asList("ashok", "maria", "anmol");
        List<String> team2 = Arrays.asList("prateek", "robin", "varun");
        List<String> team3 = Arrays.asList("aman", "jagmeet", "gagan");

        List<List<String>> finalTeam = Arrays.asList(team1, team2, team3);

        // finalTeam.stream().flatMap((t)->(t.stream())).forEach((a)-> System.out.println(a));

        finalTeam.stream().flatMap((t) -> (t.stream())).forEach(System.out::println);
    }

    static void practiceFlatMap3() {
        List<Student> st1 = Arrays.asList(new Student(101, "rahul", 'A'),
                new Student(102, "aakash", 'B'),
                new Student(103, "varun", 'C'));
        List<Student> st2 = Arrays.asList(new Student(104, "karun", 'D'),
                new Student(105, "saneh", 'E'),
                new Student(106, "milin", 'F'));

        List<List<Student>> finalList = Arrays.asList(st1, st2);

//        List<String> stNames = finalList.stream()
//                .flatMap((student) -> (student.stream()))
//                .map((st) -> (st.getStName())).collect(Collectors.toList());

        finalList.stream()
                .flatMap((student) -> (student.stream()))
                .map((st) -> (st.getStName())).forEach((s) -> System.out.println(s));

//        List<String> studentNames = finalList.stream().flatMap((w) -> (w.stream())).
//                filter((u) -> (u.getStGrade() == 'A' || u.getStGrade() == 'D')).
//                map((x) -> (x.getStName())).collect(Collectors.toList());

//        studentNames.forEach((z)-> System.out.println(z));


        // finalList.stream().flatMap((student) -> (student.stream()).map((st)->(st.getStName()))).forEach((sName)-> System.out.println(sName));

//        List<String> stNames = finalList.stream().flatMap((st) -> (st.stream()).map((student) -> (student.getStName()))).collect(Collectors.toList());

        // System.out.println(studentName);

//        stNames.forEach((s)-> System.out.println(s));


    }
}

class Product {
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Student {
    private int stId;
    private String stName;
    private char stGrade;

    public Student(int stId, String stName, char stGrade) {
        this.stId = stId;
        this.stName = stName;
        this.stGrade = stGrade;
    }

    public int getStId() {
        return stId;
    }

    public void setStId(int stId) {
        this.stId = stId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public char getStGrade() {
        return stGrade;
    }

    public void setStGrade(char stGrade) {
        this.stGrade = stGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stId=" + stId +
                ", stName='" + stName + '\'' +
                ", stGrade=" + stGrade +
                '}';
    }
}
