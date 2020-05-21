package Lesson2;

public class AnonymousThread {
    public static void main(String[] args) {
        Thread t1 = new Thread() {


            @Override
            public void run() {
                System.out.println("Hello from AnonymousThread");
            }
        };
        t1.start();
    }

}
