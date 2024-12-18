package nov23;

import java.util.*;
import java.util.stream.Collectors;

public class Test123 {
    public static void main(String[] args) {
//        double num=11.0/3;
//        System.out.println("value is: "+ num);

//        List<EmployeeNew> emp= Arrays.asList(new EmployeeNew("a",45.25,24),
//                                             new EmployeeNew("b",55.25,25));
        // System.out.println(emp);

        EmployeeNew emp1 = new EmployeeNew("a", 45.25, 24);
        EmployeeNew emp2 = new EmployeeNew("b", 55.25, 25);
        //  EmployeeNew emp3=emp2;


//        Map<EmployeeNew, String> m = new HashMap<>();
//        m.put(emp1,"A");
//        m.put(emp2,"A");
//        m.put(emp1,"A");
//        m.put(emp1,"A");

//        System.out.println("m.get(emp1) = " + m.get(emp1));

        Set<EmployeeNew> empNew= new TreeSet<EmployeeNew>();


//        System.out.println("emp1 details are: " + emp1);
        System.out.println("emp1.equals(emp2) = " + emp1.equals(emp2));
//
//        System.out.println("emp1 hashcode is: " + emp1.hashCode());
//        System.out.println("emp2 hashcode is: " + emp2.hashCode());
        // System.out.println("emp1 salary hashcode is: " + emp1.getEmpSalary().has);


        //Set<EmployeeNew> empNew= new TreeSet<EmployeeNew>((e1,e2)->Double.compare(e1.getEmpSalary(),e2.getEmpSalary()));
//        Set<EmployeeNew> empNew= new TreeSet<EmployeeNew>();
//        empNew.add(new EmployeeNew("a",45.25,24));
//        empNew.add(new EmployeeNew("b",55.25,25));

//        System.out.println(empNew);

        // System.out.println("mapPractice() = " + mapPractice());


    }

    public static Map<Integer, String> mapPractice() {
        List<String> l = Arrays.asList("one", "two", "three", "four", "five", "six");

        return l.stream().collect(Collectors.toMap(String::length, (s) -> s, (oldValue, newValue) -> oldValue + " : " + newValue));
    }
}


class EmployeeNew implements Comparable<EmployeeNew> {
    private String empName;
    private double empSalary;
    private int empAge;

    public EmployeeNew(String empName, double empSalary, int empAge) {
        this.empName = empName;
        this.empSalary = empSalary;
        this.empAge = empAge;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    @Override
    public String toString() {
        return "EmployeeNew{" +
                "empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", empAge=" + empAge +
                '}';
    }

    //@Override
//    public boolean equals(EmployeeNew o) {
//        return o.getEmpSalary()==this.getEmpSalary();
//    }

    //@Override
//    public int hashCode() {
//        return 111;
//    }

    @Override
    public int compareTo(EmployeeNew o) {
        return (int) (o.getEmpSalary() - this.getEmpSalary());
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        EmployeeNew that = (EmployeeNew) o;
//        return Double.compare(that.empSalary, empSalary) == 0 && empAge == that.empAge && Objects.equals(empName, that.empName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(empName, empSalary, empAge);
//    }
}
