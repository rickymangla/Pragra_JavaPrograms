package nov19;

public class TestMain {
    public static void main(String[] args) {
        PracticeInnerClass pc = new PracticeInnerClass();

//        pc.display();
        PracticeInnerClass.Inner_Demo1 id = pc.new Inner_Demo1();
        id.print();

        //below example is to show method level inner class
        pc.InnerMethodClass();

        Test3 t3 = new Test3();
        t3.show(new Test2() {
            @Override
            public String greet() {
                return "Hello World";
            }
        });

        //below example is to show static nested class
        Test4.Sample t4 = new Test4.Sample();
        t4.display();
        Test4.Sample.show();



    }
}
