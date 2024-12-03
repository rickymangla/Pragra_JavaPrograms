package nov30;

public class MethodRefDemo {
    public static void main(String[] args) {

        //lambda example
//        TestInterface t=(s)-> System.out.println(s);
//        t.printer("hello");

        //method ref example
//        TestInterface t=MethodRefDemo::display;
//        t.printer("hello");

        TestInterface t1=new MethodRefDemo()::show;
        t1.printer("hello world");

    }

    static void display(String s) {
        System.out.println(s);
    }

    void show(String s1) {
        System.out.println(s1);
    }
}
