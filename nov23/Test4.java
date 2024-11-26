package nov23;

public class Test4 implements Test3, Test2 {
    @Override
    public void method1() {
        System.out.println("this is method1 from class test4");
    }

    @Override
    public void method2() {
        // Test3.super.method2();
        // System.out.println("this is method2 from class test4");
    }

    @Override
    public void method3() {
        Test3.super.method3();
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
//        t.method1();
        t.method2();
//        t.method3();



    }
}
