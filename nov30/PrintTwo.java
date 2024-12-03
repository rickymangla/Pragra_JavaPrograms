package nov30;

@FunctionalInterface
interface BiConsumer {
    void consume(String a, String b);
}

public class PrintTwo {

    public void printTwoName(String name1, String name2) {
        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);
    }

    public static void main(String[] args) {
        BiConsumer bic = (a, b) -> System.out.println(a + b);
        bic.consume("printing using lambda expression" + " hello", " world");

        BiConsumer bicNew = new PrintTwo()::printTwoName;

        bicNew.consume("printing using method ref" + " java", " python");
    }
}
