import java.io.*;
class ThreadSynchronizationandInterThreadCommunication
{
    public static void main(String args[])
    {

       // System.out.println("Thread Synchronization and Inter Thread Communication");
        GoodMorning t1=new GoodMorning();
        t1.start();
        Hello h=new Hello();
        synchronized(t1)
        {
            h.start();
        }
    };
};
class GoodMorning extends Thread
{
    int i=0;
    public void run()
    {
        synchronized(this)
        {
            try{
            while(i<5)
            {

                System.out.println("Good Morning");
                sleep(500);
                i++;
            }
            }
            catch(Exception e)
                {

                }
        }
           this.notify();
        }
};
class Hello extends Thread
{
    int i=0;
    public void run()
    {
        try{
        while(i<10)
        {

            System.out.println("Hello");
            sleep(200);
            i++;
        }
        }
            catch(Exception e)
            {

            }
        }
};
