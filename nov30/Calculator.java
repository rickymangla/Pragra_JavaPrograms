package nov30;

@FunctionalInterface
interface Anything {
    int sum(int a, int b);
}

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Anything anything = new Calculator()::sum;
        int firstNumber = 5;
        int secondNumber = 10;
        // int sum = anything.sum(5, 10);
        int sum = anything.sum(firstNumber, secondNumber);
        System.out.println("sum of " + firstNumber + secondNumber + sum);

    }
}
