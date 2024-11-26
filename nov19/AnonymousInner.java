package nov19;

//below example is to show anonymous inner class example
public abstract class AnonymousInner {

    public abstract void show();

    public void method1() {
        System.out.println("this is non abstract method");
    }

}

class OuterClass {

    public static void main(String[] args) {
        
        AnonymousInner ai = new AnonymousInner() {
            @Override
            public void show() {
                System.out.println("this is to show anonymous class implementation");
            }
        };
        ai.show();
        ai.method1();

    }

}
