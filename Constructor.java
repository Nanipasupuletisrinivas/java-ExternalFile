
import java.util.*;
import java.io.*;
class Constructor
{
    public static void main(String args[])
    {
        System.out.println("Constructor implementation");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two values::");

        int a=s.nextInt();
        int b=s.nextInt();
        Myclass m=new Myclass();
        Myclass m1=new Myclass(a,b);
        m1.show();



    };
};
class Myclass
{
    int c,d;
    Myclass()
    {
        System.out.println("Implementation of Constructor Overloading");
    }
    Myclass(int a,int b)
    {
        this.c=a;
        this.d=b;
    }
    public void show()
    {
    System.out.println("In constructor");
    System.out.println(" c= "+c+" d = "+d);
    }



};
