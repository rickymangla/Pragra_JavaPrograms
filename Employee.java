public class Employee {

    int empId;
    double salary;
    String empName;
    String empDept;

    public Employee() {
        empId = 3;
        salary = 5000.50;
        empName = "Amit";
        empDept = "IT";
        printEmpDetails();
    }

    Employee(int empId, double salary) {
        this();
        this.empId = empId;
        this.salary = salary;
    }

    Employee(int empId, double salary, String empName, String empDept) {
        this(45,5500.50);
        this.empId = empId;
        this.salary = salary;
        this.empName = empName;
        this.empDept = empDept;
    }

    public void printEmpDetails() {
        System.out.println(empId + "\n" + salary + "\n" + empName + "\n" + empDept);
    }

    public String print(int a) {
        System.out.println("value of integer is: " + a);
        return "Hello world";
    }

    public String display() {
        return this.print(67);
    }


}
