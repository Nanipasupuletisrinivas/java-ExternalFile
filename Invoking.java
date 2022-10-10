class Invoking
{
    public static void main(String args[])
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println("Before swapping x="+a+" y="+b);
        System.out.println("After swapping in main Method x="+a+" y="+b);
        Method m=new Method();
        m.fun(a,b);

    };
};
class Method
{
    public void fun(int a,int b)
    {
        System.out.println("In function");
        System.out.println("After Swapping");
        int c;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("args[0]="+a+" args[1]="+b);

    };

};
