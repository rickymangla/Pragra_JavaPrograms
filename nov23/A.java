package nov23;

public interface A {

    default void play() {
        System.out.println("not playing");
    }
}

interface B {
    void work();

    default void play() {
        System.out.println("playing");
    }
}

interface C {
    void sleep();
}

//interface Human extends A, B, C {
//
//}

