package Thread_Synchronization;

public class SynchronizationStatement
{
    private static long c1 = 0;
    private  static long c2 = 0;

    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void inc1()
    {
        synchronized (lock1)
        {
            c1++;
        }
    }
    public static void inc2()
    {
        synchronized (lock2)
        {
            c2++;
        }
    }

    public static void main(String[] args)
    {
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i=0; i<10_000; i++)
                {
                    inc1();
                }
            }
        });

        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
              for (int i = 0 ; i<5000; i++)
              {
                  inc2();
              }
            }
        });
        t1.start();
        t2.start();
        try {

            t1.join();
            t2.join();

        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Value of c1: "+ c1);
        System.out.println("Value of c2: "+ c2);
    }
}

