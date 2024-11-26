package nov12;

public class Employee {

    private String empName;
    private double empSalary;
    private int empId;
    private String dept;

    public Employee() {

    }
    public Employee(String empName, double empSalary, int empId, String dept) {
        this.empName = empName;
        this.empSalary = empSalary;
        this.empId = empId;
        this.dept = dept;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", empId=" + empId +
                ", dept='" + dept + '\'' +
                '}';
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

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }




}
