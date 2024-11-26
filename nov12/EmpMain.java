package nov12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpMain {

    public static void main(String[] args) {
        List<Employee> l = new ArrayList<>();

        l.add(new Employee("amit", 6789.50, 101, "CSE"));
        l.add(new Employee("deepak", 7789.50, 102, "MECH"));
        l.add(new Employee("robin", 8789.50, 103, "COMPUTER"));
        l.add(new Employee("harsh", 9789.50, 104, "CIVIL"));

        System.out.println("list details are: " + l);

       // System.out.println("result is: " + l.contains(new Employee("robin", 8789.50, 103, "COMPUTER")));

        Iterator<Employee> it = l.iterator();
        int iteration = 0;
        while (it.hasNext()) {
//            System.out.println(it.next());

            Employee e = it.next();
            if (e.getEmpName().equals("robin")) {
                System.out.println("employee with name robin has been found" + " at iteration " + iteration );
                break;
            }
            iteration++;
            System.out.println("Employee Details are: " + e.getEmpId() + "\t" + e.getDept() + "\t" + e.getEmpName() + "\t" + e.getEmpSalary());
        }

//        String s1 = "Hello";
//        String s2 = "Hello";
//        String s3 = new String("Hello");
//        String s4 = new String("Hello");
//
//        System.out.println(s1.equals(s2));  //true
//        System.out.println(s1==s2);      //true
//        System.out.println(s3.equals(s4));  //true
//        System.out.println(s3==s4);    //false
//        System.out.println(s1.equals(s3));  //true
//        System.out.println(s1==s3);  //false




    }

}
