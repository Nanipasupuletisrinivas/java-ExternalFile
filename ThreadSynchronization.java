class ThreadSynchronization
{
    public static void main(String rags[])
    {
        Welcome t1=new Welcome();
        t1.start();
        Hi h=new Hi();
        synchronized(t1)
        {
            h.start();
        }
    };
};
class Welcome extends Thread
{
    int i=0;
    public void run()
    {
        synchronized(this)
        {
        while(i<5)
        {
        System.out.println("Welcome");
        i++;
        }
        this.notify();
    };
};
}
class Hi extends Thread
{
    int i=0;
    public void run()
    {
        while(i<5)
        {
            System.out.println("Hi");
            i++;
        }
    }
};
