package nov19;

public class PracticeInnerClass {

    private int number = 10;

    private class Inner_Demo {
        public void print() {
            System.out.println("this is method of inner class");
        }
    }

    class Inner_Demo1 {
        public void print() {
            System.out.println("this is method of inner class");
            System.out.println(number);
        }
    }


    public void display() {
        Inner_Demo id = new Inner_Demo();
        id.print();
    }

    //below example is to show method level inner class

    public void InnerMethodClass() {
        int number = 23;

        class InnerDemo {
            public void display() {
                System.out.println("value of number is: " + number);
            }
        }

        InnerDemo id1=new InnerDemo();
        id1.display();
    }

}
