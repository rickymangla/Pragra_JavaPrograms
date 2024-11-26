package nov23;
@FunctionalInterface

public interface Test3 extends Test2 {

    void method1();
   default void method2() {
       System.out.println("this is method2 from interface test3");
    }

    default void method3() {
        System.out.println("this is method3 from interface test3");
    }

    default void method4() {
        System.out.println("this is method4 from interface test3");
    }
}
