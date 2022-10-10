import java.util.*;
class SinglelevelInheritance
{
    public static void main(String args[])
    {
        System.out.println("Enter 3 numbers::");
        Scanner s=new Scanner(System.in);
        float a=s.nextFloat();
        float  b=s.nextFloat();
        float c=s.nextFloat();
        Extended e=new Extended();
        e.show(a,b,c);
        e.compute();
    };
};
class Main
{
    float a,b,c;
    public void show(float a,float b,float c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("First class");
    };
};
class Extended extends Main
{
    public void compute()
    {
        float avg=(a+b+c)/3;
        System.out.println("Average of Main class 3 numbers is "+avg);
    };
};
