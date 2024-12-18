package dec12;

public class ThreadPractice {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " " + "Task 1 finished");
        });

        thread.setName("thread 1");
        thread.start();

        AnotherThreadTask an = new AnotherThreadTask();
        an.start();

    }


}
