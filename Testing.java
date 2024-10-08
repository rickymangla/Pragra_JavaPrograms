public class Testing {

    Employee emp;

    public Employee printDetails() {
     //   return new Employee();
        emp= new Employee();
        return emp;

    }
    public static void main(String[] args) {
        Testing testing=new Testing();
        testing.printDetails();

      //  Employee employee=new Employee();
//        Employee employee=new Employee(25,5100.50,"kabir","mechanical");

       // employee.printEmpDetails();

//        System.out.println(employee.display());
    }
}
