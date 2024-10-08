import java.util.LinkedList;
import java.util.Scanner;

public class Sept24 {
    public static void main(String[] args) {

        //print 1-n numbers and print sum of n numbers

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter last number");
//        int lastNumber = sc.nextInt();
//
//        int number = 1;
//        int sum = 0;
//        while (number <= lastNumber) {
//            System.out.print(number + " ");
//            sum = sum + number;
//            number++;
//        }
//        System.out.println();
//        System.out.println("sum is: " + sum);
//        //System.exit(1);
//        System.out.println("program finished");

        LinkedList<Integer> l = new LinkedList<>();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter choice");
        int choice = sc1.nextInt();
        while (choice != 10) {
            System.out.println("Enter element value");
            int value = sc1.nextInt();
            System.out.println("Enter index number");
            int indexNumber = sc1.nextInt();
            switch (choice) {
                case 1:
                    l.addLast(value);
                case 2:
                    l.addFirst(value);
                case 3:
                    l.add(indexNumber, value);
                case 4:
                    l.removeFirst();
                case 5:
                    l.removeLast();
                case 6:
                    l.remove(value);
                case 7:
                    l.remove(indexNumber);
                case 8:
                    System.out.println(l);
                default:
                    System.out.println("Invalid linkedlist");
            }
        }
        System.exit(1);


    }
}
