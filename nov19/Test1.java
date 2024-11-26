package nov19;

public interface Test1 {

    public void method1();
}

class Outer {
    public static void main(String[] args) {
        Test1 t= new Test1() {
            @Override
            public void method1() {
                System.out.println("this is to show anonymous inner class example for interface");
            }
        };
        t.method1();
    }
}
