public class Testing {
    Employee emp;

    int number = 23;
    static String name = "amit";

    static int counter = 0;

//    static {
//        System.out.println("this is static block");
//    }
//
//    {
//        System.out.println("this is instance block");
//    }
//
//    static void display() {
//        System.out.println("this is static method");
//    }
//
//    void show() {
//        System.out.println("this is non static method");
//    }

    Testing() {
//        counter++;
//        System.out.println(counter);
//        System.out.println("this is constructor");
    }



    public String toString() {
        return number + " " + name;
    }

    public Employee printDetails() {
        //   return new Employee();
        emp = new Employee();
        return emp;

    }

    public static void main(String[] args) {
        Testing testing = new Testing();
        //   System.out.println(testing);
        //       testing.printDetails();

        //  Employee employee=new Employee();
//        Employee employee=new Employee(25,5100.50,"kabir","mechanical");

        // employee.printEmpDetails();

//        System.out.println(employee.display());
    }
}
