package dec12;

public class AnotherThreadTask extends Thread {

    @Override
    public void run() {
        System.out.println("task 2 started");
    }
}
