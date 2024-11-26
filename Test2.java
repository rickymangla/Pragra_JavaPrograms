public class Test2 {
    static int x = 10;

    public static void change(int x) {
        x = 20;
    }

    public static void display(int x) {
        x=30;
    }

    public static void main(String[] args) {
//        x=20;
//        System.out.println(x);
//        change(x);
        display(x);
        System.out.println(x);
    }
}
