import java.io.*;
import java.util.*;
class throwthrowsandfinally
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("throwthrowsandfinally");
        int a=1;
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("enter a value::");
        String s1=br.readLine();
        int c=Integer.parseInt(s1);
        int b=Integer.parseInt(args[0]);
        try
        {
                throw new ArithmeticException();
        }
       // catch(ArithmeticException e)
        //{
         //   System.out.println("ARITHMETIC EXCEPTION caught");
        //}
        catch(Exception e)
        {
            System.out.println("Exception caught");
        }
        finally
        {
            System.out.println("Finally Completed");
        }

    };
};
