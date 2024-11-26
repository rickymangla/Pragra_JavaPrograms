public class EmployeePractice {

    public double calculateSalary(double hourlyPay) {
        return hourlyPay;
    }
}

class FTE extends EmployeePractice {

    private double hoursWorked;

    FTE(double hoursWorked) {
        this.hoursWorked=hoursWorked;
    }
    @Override
    public double calculateSalary(double hourlyPay) {
        return hourlyPay*hoursWorked;
    }
}

class Contractor extends EmployeePractice {

    private double hoursWorked;

    Contractor(double hoursWorked) {
        this.hoursWorked=hoursWorked;
    }
    @Override
    public double calculateSalary(double hourlyPay) {
        return hourlyPay*hoursWorked;

    }
}

class Test24 {
    public static void main(String[] args) {
        EmployeePractice fte=new FTE(40.0);
        System.out.println("full time employee salary is: " + fte.calculateSalary(40.0));
        EmployeePractice cte=new Contractor(45.0);
        System.out.println("contractor salary is: " + cte.calculateSalary(50.0));
    }
}
