/*Q_1*
    Write a program to create two threads. The first thread should print numbers from 1 to 10
    intervals of 0.5 second and the second threads should print numbers from 11 to 20 at the interval of
    1 second.

 */
package Lesson4;

class First extends Thread
{
    @Override
    public void run()
    {
       for (int i=1; i<=10; i++)
       {
           System.out.println(i);
       }
       try
       {
           Thread.sleep(500);
       }
       catch (InterruptedException e)
       {

       }
    }
}
 class Second extends Thread
{
    @Override
    public void run()
    {
        for (int i=11; i<=20; i++)
        {
            System.out.println(i);
        }
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {

        }
    }
}

public class Demo
{
    public static void main(String[] args)
    {
        Thread first = new First();
        Thread second= new Second();
        first.start();
        second.start();
    }
}
