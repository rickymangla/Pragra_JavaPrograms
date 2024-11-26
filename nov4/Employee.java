package nov4;

public class Employee {

    private long id;
    private String name;
    private double salary;
    private String email;
    private String address;
    private Address address1;

    public Address getAddress1() {
        return address1;
    }

    public void setAddress1(Address address1) {
        this.address1 = address1;
    }

    public Employee(long id, String name, double salary, String email, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
        this.address = address;
    }

    public Employee(long id, String name, double salary, String email, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
        this.address1 = address;
    }

    public void showEmployeeDetails() {
        System.out.println("ID is: " + id + "name is: " + name + "salary is: " +
                            salary + "email is: " + email + "address is: " + address);
    }

    public void showEmployeeDetail() {
        System.out.println("ID is: " + id + "name is: " + name + "salary is: " +
                salary + "email is: " + email + "address is: " + address1);
    }

}
