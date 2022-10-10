//Quadratic equation
import java.io.*;
import java.util.*;
class QuadraticEquation
{
    public static void main(String args[])
    {
        System.out.println("Program on Quadratic Equation");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a b and c values::");
        double a=s.nextDouble();
        double b=s.nextDouble();
        double c=s.nextDouble();
        Root r=new Root(a,b,c);
    };
};
class Root
{
    Root(double a,double b,double c)
    {
        double d=(b*b)-(4*a*c);
        double root1=(double)(-b)+(Math.sqrt(d))/(2*a);
        double root2=(double)(-b)-(Math.sqrt(d))/(2*a);
        if(d==0)
        {
         System.out.println("Roots are real and equal");
         System.out.println("Roots:"+root1);
        }
        else if(d>0)
        {
            System.out.println("Roots are real and Unequal");
            System.out.println(root1);
            System.out.println(root2);
        }
        else
        {
            System.out.println("Roots are real and Imaginary");
            double real=-b/(2*a);
            double imaginary=Math.sqrt(-d)/(2*a);
            System.out.println("Real::"+real);
            System.out.println("imaginary::"+imaginary);

        }


    }
};
