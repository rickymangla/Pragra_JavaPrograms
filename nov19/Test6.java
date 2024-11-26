package nov19;

public class Test6 {
    public static void main(String[] args) {
        Test5 t5 = new Test5() {
            @Override
          public void method1() {
                System.out.println("This is method of child class");
            }
        };
        t5.method1();

    }
}
