package nov4;

public class Test implements Third {
    @Override
    public void show() {
        System.out.println("this is method of java class");
    }

    @Override
    public void display() {

    }
}

class Main {
    public static void main(String[] args) {
        First f=new Test();
        f.display();
    }
}
