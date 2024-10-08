import java.util.Scanner;

public class Sept28 {
    public static void main(String[] args) {
        //factorial of a number

        Scanner sc = new Scanner(System.in);
////        System.out.println("enter input number");

////        int number = sc.nextInt();
////        int factorial = 1;
////        do {
////            factorial = factorial * number;
////            number--;
////        }
////        while (number > 0);
//
////        System.out.println("factorial is: " + factorial);
//
//        //product table of a number
//
////        System.out.println("Enter a number");
////        int num = sc.nextInt();
////        int initialNUmber = 1;
////        do {
////            System.out.println(num + "*" + initialNUmber + "=" + num * initialNUmber);
////            initialNUmber++;
////        }
////        while (initialNUmber <= 10);
//


//        //print numbers 1-100 whenever you see multiple of 7, you should see multiple of 7
//
//        for (int i = 1; i <= 100; i++) {
//            if (i % 7 == 0) {
//                System.out.println("abc");
//            } else {
//                System.out.println(i);
//            }
//        }
        lotteryProblem();
        //       pattern();

        //calculator problem
        calculator();
    }

    //Lottery Problem
    public static void lotteryProblem() {

        Scanner sc = new Scanner(System.in);
        int luckyNumber = 22;
        boolean win = false;
        for (int i = 1; i <= 3; i++) {
            System.out.println("User should enter a number");
            int num = sc.nextInt();
            if (num == luckyNumber) {
                System.out.println("Congratulations you won");
                win = true;
                break;
            } else {
                if (i == 3 && win == false)
                    System.out.println("you have lost the game");
                else {
                    System.out.println("try again");
                }
            }
//            if(i==3 && win==false) {
//                System.out.println("you have lost the game");
//            }
        }
    }

    //nested for loop
    /*
      1 2 3 4 5
      2 4 6 8 10
      3 6 9 12 15
     */
    public static void pattern() {
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }

    public static void calculator() {
        Scanner sc = new Scanner(System.in);
        int option;
        int num2;
        int num3;
        char choice;
        do {
            System.out.println("Welcome to my Calculator");
            System.out.println("************");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Multiplication");
            System.out.println("5. Modulus");
            System.out.println("0. Exit");
            System.out.println("Enter option");
            option = sc.nextInt();
            if (option > 5) {
                System.out.println("Invalid Choice");
//                System.exit(0);
                return;
            }
            System.out.println("Enter first number");
            num2 = sc.nextInt();
            System.out.println("Enter second number");
            num3 = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Addition of two numbers is: " + (num2 + num3));
                    break;
                case 2:
                    System.out.println("Subtraction of two numbers is: " + (num2 - num3));
                    break;
                case 3:
                    System.out.println("Division of two numbers is: " + (num2 / num3));
                    break;
                case 4:
                    System.out.println("Multiplication of two numbers is: " + (num2 * num3));
                    break;
                case 5:
                    System.out.println("Modulus of two numbers is: " + (num2 % num3));
                    break;
            }
            System.out.println("Do you want to continue?");
            choice = sc.next().charAt(0);
        }
        while (choice == 'y' || choice == 'Y');
    }
}
