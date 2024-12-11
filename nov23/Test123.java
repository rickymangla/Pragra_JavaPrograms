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

        //Set<EmployeeNew> empNew= new TreeSet<EmployeeNew>((e1,e2)->Double.compare(e1.getEmpSalary(),e2.getEmpSalary()));
//        Set<EmployeeNew> empNew= new TreeSet<EmployeeNew>();
//        empNew.add(new EmployeeNew("a",45.25,24));
//        empNew.add(new EmployeeNew("b",55.25,25));

//        System.out.println(empNew);

        System.out.println("mapPractice() = " + mapPractice());


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

    @Override
    public int compareTo(EmployeeNew o) {
        return (int) (o.getEmpSalary() - this.getEmpSalary());
    }

}
