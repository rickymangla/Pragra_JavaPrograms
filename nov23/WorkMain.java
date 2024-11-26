package nov23;

public class WorkMain {
    public static void main(String[] args) {
        Work work= new Work() {
            @Override
            public void work() {
                System.out.println("Employee is doing some work");
            }

            @Override
            public double getPaid(int hours, double wage) {
                return hours*wage;
            }
        };

        work.work();
        System.out.println("Salary is: " + work.getPaid(40,25.50));

    }
}
