class Sample
{
    public static void main(String args[])
    {
        Hello h=new Hello();
        System.out.println("Nani");
        System.out.println("Pasupuleti");
        h.start();
        int i=0;
        while(i<10)
        {
            System.out.println("NAni");
            i++;
        }
    };
};
class Hello extends Thread
{
    int i=0;
    public void run()
    {
        while(i<10)
        {
            System.out.println("Hi");
            i++;
        }
    };
};
