package nov4;

public class EmpMain {
    public static void main(String[] args) {
        Employee e = new Employee(101, "robin", 12345.234, "robin@gmail.com", "toronto");
        e.showEmployeeDetails();

        Employee e1 = new Employee(102, "ricky", 123.45, "ricky@gmail.com",
                new Address("brampton", "pacific", "ontario", "l6r 2b1"));

        e1.showEmployeeDetail();

        String postalCode=e1.getAddress1().getPostalCode();
        System.out.println("postal code is: " + postalCode);





    }
}
