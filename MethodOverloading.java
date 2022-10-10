//Method overloading
import java.util.*;
class MethodOverloading
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two values::");
        int a=s.nextInt();
        int b=s.nextInt();
        Mechanism m=new Mechanism();
        m.method(a,b);
        m.method(a,b,2);

    };
};
class Mechanism
{
    public void method(int a,int b)
    {
        System.out.println("Addition of 2 values::"+(a+b));
    } ;
    public void method(int a,int b,int c)
    {
        System.out.println("Addition of 3 values is::"+(a+b+c));

    }
};
