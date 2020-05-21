package Lesson3;

public class AnonymousRunnableThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread");
            }
        });

        t1.start();
    }
}
