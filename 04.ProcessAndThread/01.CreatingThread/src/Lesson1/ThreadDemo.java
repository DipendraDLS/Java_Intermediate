package Lesson1;

class HelloRunnable implements Runnable
{

    @Override
    public void run()
    {
        System.out.println("Hello from thread");
    }
}

public class ThreadDemo
{
    public static void main(String[] args)
    {
        Thread obj = new Thread(new HelloRunnable());
        obj.start();
    }
}
