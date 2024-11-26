package nov23;

public class Test {
    public static void main(String[] args) {
        String s = display();
        System.out.println(s);

    }

    void show() {
        System.out.println("this is void method");
    }

    static String display() {
        System.out.println("this is string method");
        return "hello";
    }
}
