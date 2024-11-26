package nov5;

public class ExceptionPractice {

    public static void main(String args[]) {
        System.out.println(testFinallyBlock());
    }

    private static int testFinallyBlock() {
        int a[] = new int[2];
        try {
            return 1;
        } catch (ArithmeticException e) {
            System.out.println("Exception thrown  :" + e);
        }finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
        System.out.println("end of program");
        return 0;
    }

}
