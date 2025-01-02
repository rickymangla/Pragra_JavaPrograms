import java.util.Scanner;

public class BankingSystem {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome to the XYZ Banking System!");
//        System.out.println("Choose 4 digit pin");
//        int pin = sc.nextInt();
//        System.out.println("Please choose an option");
//        System.out.println("1 Check Balance" + "\n" + "2 Deposit Money" + "\n" + "3 Withdraw Money" + "\n" + "4 Exit");
//        int balance = 0;
//        int userPin;
//        int option = sc.nextInt();
//
//        do {
//            while (option > 4) {
//                System.out.println("Invalid option. Please try again");
//                option = sc.nextInt();
//            }
//
//            switch (option) {
//                case 1:
//                    System.out.println("Current balance is: " + balance);
//                    break;
//                case 2:
//                    System.out.println("Enter 4 digit pin");
//                    userPin = sc.nextInt();
//                    if (userPin == pin) {
//                        System.out.println("Enter an amount to deposit");
//                        int amount = sc.nextInt();
//                        balance = balance + amount;
//                        System.out.println("Current Balance is: " + balance);
//                        break;
//                    } else {
//                        System.out.println("Invalid Pin, Please try again");
//                        //  return;
//                        break;
//                    }
//                case 3:
//                    System.out.println("Enter 4 digit pin");
//                    userPin = sc.nextInt();
//                    if (userPin == pin) {
//                        System.out.println("Enter an amount to be withdrawn");
//                        int withdrawlAmount = sc.nextInt();
//                        while (withdrawlAmount > balance) {
//                            System.out.println("Withdrawl amount " + withdrawlAmount + "is more than " + balance + "\n" + "Enter withdrawl amount less than or equal to balance");
//                            withdrawlAmount = sc.nextInt();
//                        }
//                        balance = balance - withdrawlAmount;
//                        System.out.println("Current Balance is: " + balance);
//                        break;
//                    } else {
//                        System.out.println("Invalid Pin, Please try again");
//                        break;
//                        //  return;
//                    }
//                case 4:
//                    //  System.exit(0);
//                    return;
//            }
//
//            System.out.println("Please choose an option");
//            System.out.println("1 Check Balance" + "\n" + "2 Deposit Money" + "\n" + "3 Withdraw Money" + "\n" + "4 Exit");
//            option = sc.nextInt();
//        }
//        while (option != 4);

        String s1=new String("abc");
        String s2=new String("abc");
        System.out.println(s1==s2);


        Integer i1=23;
        Integer i2=23;
        System.out.println("i1.hashCode() = " + i1.hashCode());
        System.out.println("i2.hashCode() = " + i2.hashCode());

    }
}
