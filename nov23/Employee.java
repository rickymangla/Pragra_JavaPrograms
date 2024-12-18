package nov23;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Employee {

    private String eName;
    private int eSalary;
    private int experience;

    public Employee(String eName, int eSalary, int experience) {
        this.eName = eName;
        this.eSalary = eSalary;
        this.experience = experience;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteSalary() {
        return eSalary;
    }

    public void seteSalary(int eSalary) {
        this.eSalary = eSalary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> l = new ArrayList<>();
        l.add(new Employee("Amit", 50000, 5));
        l.add(new Employee("Rahul", 60000, 2));
        l.add(new Employee("Alok", 20000, 7));

        Function<Employee, Integer> f = (emp1) -> (emp1.geteSalary() * 5 / 100);

        Predicate<Integer> p4 = (i) -> i >= 2000;

        Consumer<Employee> c = (emp2) -> {
            System.out.println(emp2.geteName() + " " + emp2.getExperience());
        };

        Supplier<Date> s = () -> (new Date());
        System.out.println(s.get());

        for (Employee e : l) {
            int bonus = f.apply(e);
            if (p4.test(bonus)) {
                c.accept(e);
                System.out.println("Employee bonus is: " + bonus);
            }
        }

        Consumer<String> c1 = (s1) -> System.out.println(s1);
        Consumer<String> c2 = (s1) -> System.out.println(s1);
        Consumer<String> c3 = (s1) -> System.out.println(s1);

        c1.andThen(c2).andThen(c3).accept("Cow");

        Function<Integer, Integer> f1 = (n) -> (n * 2);
        Function<Integer, Integer> f2 = (n1) -> (n1 * n1);

        System.out.println(f1.andThen(f2).apply(3));

        Supplier<String> s1=()->("Hello");

        System.out.println(s1.get());


//        Employee e1 = new Employee("Amit", 50000, 5);
//        Employee e2= new Employee("Rahul", 60000, 2);
//        Employee e3 = new Employee("Alok", 20000, 7);

//        Predicate<Employee> p = (emp) -> (emp.geteSalary() > 30000 && emp.getExperience() > 3);
//
//        for (Employee e : l) {
//            if (p.test(e)) {
//                System.out.println("required employee is: " + e.geteName());
//            }
//        }
////        if(p.test(e)) {
////            System.out.println("required employee: " + e.geteName());
////        }
//
//        int a[] = new int[]{50, 30, 20, 45, 65, 43};
//        Predicate<Integer> p1 = i -> (i % 2 == 0 && i > 20);
//        Predicate<Integer> p2 = i -> (i % 2 == 0);
//        Predicate<Integer> p3 = i -> (i > 20);
////        for(int j:a) {
////            if(p1.test(j)) {
////                System.out.println("required number is: " + j);
////            }
////        }
//
//        for (int j : a) {
//            if (p2.and(p3).test(j)) {
//                System.out.println("required number is: " + j);
//            }
//        }
//
//        for (int k : a) {
//            if (!p2.test(k)) {
//                System.out.println("odd number is: " + k);
//            }
//        }
//
////        for(int k:a) {
////            if(p2.negate().test(k)) {
////                System.out.println("odd number is: " + k);
////            }
////        }
    }
}
