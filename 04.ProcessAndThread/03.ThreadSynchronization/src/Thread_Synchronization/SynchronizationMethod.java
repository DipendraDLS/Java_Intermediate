package Thread_Synchronization;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class SynchronizationMethod
{

        public static int count=0;

        public static synchronized void incount()
        {
            count++;
        }


        public static void main(String[] args)
        {
            //Creating 1st Thread
            Thread t1 = new
                    Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    System.out.println("Thread 1 in execution");

                    for (int i =0; i<10_000; i++)
                       incount();

                }
            });

            //Creating 2nd Thread
            Thread t2  = new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    System.out.println("Thread 2 in execution");
                    for (int i = 0; i<10_000; i++)
                        incount();
                }
            });

            t1.start();
            t2.start();
            try
            {
                //join() method can be used to pause the current thread execution until unless the specified thread is dead.
                t1.join();
                t2.join();

            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("Value of Count: " + count);

        }
}

