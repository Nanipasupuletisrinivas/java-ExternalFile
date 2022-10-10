import java.io.*;
class GoodMorning
{
    public static void main(String args[])
    {
        System.out.println("Good Class");
        GoodMorningThread t1=new GoodMorningThread();
        t1.start();
        Hello t2=new Hello();
        t2.start();
        Welcome t3=new Welcome();
        t3.start();


    };
};
class GoodMorningThread extends Thread
{

    public void run()
    {   int i=0;
        try
        {
            while(i<5)
            {

            sleep(100);
            System.out.println("GoodMorning class");
            i++;
            }
        }
        catch(Exception e)
        {

        }
    };

};
class Hello extends Thread
{
    int i=0;
    public void run()
    {
        try
        {
            while(i<5)
            {
                sleep(200);
                System.out.println("Hello");
                i++;
            }
        }
        catch(Exception e)
        {

        }

    };
};
class Welcome extends Thread
{
    int i=0;
    public void run()
    {
        try{
            while(i<5)
            {

        System.out.println("Welcome");
        sleep(300);
        i++;
            }
        }

        catch(Exception e)
        {

        }


    };
};
