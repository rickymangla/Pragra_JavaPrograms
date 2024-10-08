import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //        System.out.println("************");
//        System.out.println("Welcome to my Calculator");
//        System.out.println("************");
//        System.out.println("1. Addition");
//        System.out.println("2. Subtraction");
//        System.out.println("3. Division");
//        System.out.println("4. Multiplication");
//        System.out.println("5. Modulus");
//        System.out.println("0. Exit");

        System.out.println("1 Addition" + "\n" + "2 Subtraction" + "\n" + "3 Division" + "\n" + "4 Multiplication"
                            + "\n" + "5 Modulus" + "\n" + "0 Exit");

        System.out.println("Enter the option");
        Scanner sc=new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

       // System.out.println("Select the option");
       // Scanner sc = new Scanner(System.in);

        if (input == 1) {
            System.out.println(num1 + num2);
        } else if (input == 2) {
            System.out.println(num1 - num2);
        } else if (input == 3) {
            System.out.println(num1 / num2);
        } else if (input == 4) {
            System.out.println(num1 * num2);
        } else if (input == 5) {
            System.out.println(num1 % num2);
        } else if (input == 0) {
            System.exit(0);
        }

        sc.close();
    }
}
