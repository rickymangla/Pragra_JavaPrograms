package nov30;

//import java.awt.desktop.SystemSleepEvent;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.*;
import java.util.function.BinaryOperator;
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

        //   practiceFlatMap();
        //  practiceFlatMap2();
        // practiceFlatMap3();

        //to practice distinct method in stream
        // practiceDistinct();

        // to practice min, max method of stream API
        // practiceterminalMethods();

        // to practice sorted method of stream API
        //  sortedMethod();

        // to practice anyMatch,allMatch,noneMatch method of stream API
        //  matchMethod();

        //to practice findAny, findFirst method of stream API
        // findMethod();

        //to find sum of numbers in list using reduce method of stream API
        // sumList();

        //sortingMethod();

        noNeg();

        //  practiceBinaryOperator();

        //compareMethod();

        // noNeg1();

        practiceOptionalClass();


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

        Collections.sort(l, new SalaryComparator());

        System.out.println("l = " + l);


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

    static void practiceDistinct() {
        List<String> l = Arrays.asList("hello", "to", "java", "hello", "to");
        List<String> distinctList = l.stream().distinct().collect(Collectors.toList());
        distinctList.forEach((s) -> System.out.println(s));

        // count method from stream
        long countItems = l.stream().distinct().count();
        System.out.println("total items are: " + countItems);

        long countItemsNew = l.stream().count();
        System.out.println("total items without distinct method: " + countItemsNew);

        // limit method of stream
        List<String> limitItems = l.stream().limit(3).collect(Collectors.toList());
        limitItems.forEach((v) -> System.out.println(v));


    }

    static void practiceterminalMethods() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> l1 = Arrays.asList(2, 5, 1, 3);
        List<String> s1 = Arrays.asList("hello", "to", "java");

        long evenNumberCount = l.stream().filter((i) -> (i % 2 == 0)).count();
        System.out.println("even number count is: " + evenNumberCount);

        // min method of stream API
        Optional<Integer> minValue = l1.stream().min((i1, i2) -> {
            return i1.compareTo(i2);
        });
        System.out.println("minimum value is: " + minValue.get());
        Optional<String> minStirng = s1.stream().min((s3, s4) -> {
            return s3.compareTo(s4);
        });

        System.out.println("minimum string is: " + minStirng.get());

        //max method of stream API
        Optional<Integer> maxValue = l1.stream().max((i1, i2) -> {
            return i1.compareTo(i2);
        });
        System.out.println("maximum value is: " + maxValue.get());

        //reduce method of stream API
        List<String> s = Arrays.asList("A", "C", "E", "1", "2", "3");
        Optional<String> reducedString = s.stream().reduce((value, combinedValue) -> {
            return value + combinedValue;
        });
        System.out.println("combined string is:" + reducedString.get());

        List<Integer> l3 = Arrays.asList(3, 5, 6, 7, 8);
        Object[] integerArrays = l3.stream().toArray();
        for (Object i : integerArrays) {
            System.out.println(i);
        }

    }

    static void sortedMethod() {
        List<Integer> l = Arrays.asList(4, 6, 1, 2, 6, 7);
        List<Integer> sortedList = l.stream().sorted().collect(Collectors.toList());
        sortedList.forEach((i) -> System.out.println(i));

        List<Integer> reverseList = l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        reverseList.forEach((j) -> System.out.println(j));
    }

    static void matchMethod() {
        Set<String> s = new HashSet<>();
        s.add("hello");
        s.add("to");
        s.add("java");
        boolean find = s.stream().anyMatch((d) -> d.startsWith("h"));  //true
        System.out.println(find);

        find = s.stream().allMatch((f) -> f.startsWith("h"));  //false
        System.out.println(find);

        find = s.stream().noneMatch((g) -> g.startsWith("h"));  //false
        System.out.println(find);

    }

    static void findMethod() {
        List<Integer> l = Arrays.asList(4, 6, 7, 8, 2);

        Optional<Integer> value = l.stream().findAny();
        System.out.println(value.get());

        Optional<Integer> firstValue = l.stream().findFirst();
        System.out.println(firstValue.get());
    }

    static void sortingMethod() {
        List<Integer> l = Arrays.asList(2, 4, 1, 9, 3);

        l.stream().sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList()).forEach((n) -> System.out.println(n));
        System.out.println("minimum value is: " + l.stream().min((i1, i2) -> i1.compareTo(i2)).get());

        List<String> l1 = Arrays.asList("hello", "to", "java");
        l1.stream().sorted((s1, s2) -> s1.compareTo(s2)).forEach((s) -> System.out.println(s));

        List<Double> l2 = Arrays.asList(2.4, 4.5, 6.7);
        l2.stream().sorted((i1, i2) -> i1.compareTo(i2)).forEach((y) -> System.out.println(y));

    }

    static void sumList() {
        List<Integer> l = Arrays.asList(3, 5, 6, 4, 6);
        Optional<Integer> sumList = l.stream().reduce((val1, val2) -> val1 + val2);
        System.out.println(sumList.get());
    }

    static void noNeg() {

        List<Integer> l = Arrays.asList(1, 2, 19);

        List<Integer> noNegNumbers = l.stream().filter((i) -> i % 10 != 9).collect(Collectors.toList());
        System.out.println(noNegNumbers);

    }

    static void noNeg1() {
        List<Integer> l = Arrays.asList(1, -2);
        List<Integer> noNegNumbers = l.stream().filter((n) -> n > 0).collect(Collectors.toList());
        System.out.println("noNegNumbers = " + noNegNumbers);
    }

    static void practiceOptionalClass() {
//        String s1[] = new String[5];
//        s1[0] = "hello";
//        s1[1] = "to";
//        s1[2] = "java";

        // System.out.println(s1[3].toUpperCase());

//        if(!s1[3].isEmpty()) {
//            System.out.println("after converting: " + s1[3].toUpperCase());
//        }
//        else {
//            System.out.println("value does not exist");
//        }

//        Optional<String> s=Optional.ofNullable(s1[3]);
//        if(s.isPresent()) {
//            System.out.println("after converting to uppercase: " + s.get().toUpperCase());
//        }
//        else {
//            System.out.println("value does not exist");
//        }

//        Optional<String>o1=Optional.of(s1[3]);
//
//        if(o1.isPresent()) {
//            System.out.println(s1[3]);
//        }
//        else {
//            System.out.println("s1[3] is not present");
//        }

//        Optional<String> o2 = Optional.empty();
//        if (o2.isPresent()) {
//            System.out.println(s1[1]);
//        } else {
//            System.out.println("s1[3] is not present");
//        }

        Optional<Cat> optionalCat = findCatByName("Fred");
//        if (optionalCat.isPresent()) {
//            System.out.println(optionalCat.get().getAge());
//        } else {
//            System.out.println(0);
//        }

      //  Cat unknown = optionalCat.orElseGet(() -> new Cat("unknown", 0));

     //   System.out.println(unknown);

//        System.out.println(optionalCat.map(Cat::getName).orElse("cat does not exist"));
//
//        Cat cat = optionalCat.orElseThrow(() -> new RuntimeException("cat does not exist"));
//        System.out.println("cat.getName() = " + cat.getName());

        String catName = optionalCat.map((c) -> c.getName()).orElseThrow(() -> new RuntimeException("cat name does not exist"));
        System.out.println("catName = " + catName);


//        try {
//            String s=null;
//            String s1=s.toUpperCase();
//        } catch (Exception e) {
//            throw new RuntimeException("string cannot be converted to upperCase",e);
//        }



    }

    private static Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name, 3);
        return Optional.ofNullable(cat);
    }


    static void practiceBinaryOperator() {
        BinaryOperator<Integer> b = (n1, n2) -> n1 > n2 ? n1 : n2;
        System.out.println("b.apply(10,15) = " + b.apply(10, 15));
    }

    static void compareMethod() {
        String s = "Robin";
        String s1 = "robin";

        System.out.println("s.compareTo(s1) = " + s.compareTo(s1));
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

class Employee implements Comparable<Employee> {
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

    @Override
    public int compareTo(Employee e) {
        //   return (int)(this.getSalary()-e.getSalary());
        return this.getName().compareTo(e.getName());
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

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return (int) (e1.getSalary() - e2.getSalary());
    }
}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
