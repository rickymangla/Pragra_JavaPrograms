package nov23;
@FunctionalInterface
public interface Test2 {

    void method1();

    default void method2() {
        System.out.println("this is method2 from interface test2");
    }

    default void method3() {
        System.out.println("this is method 3 from interface test2");
    }
}
