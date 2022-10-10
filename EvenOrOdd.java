import java.io.*;
import java.util.*;

class EvenOrOdd
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("Even or Odd Program");
        System.out.println("Enter a number");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s1=br.readLine();
        int a=Integer.parseInt(s1);
        if(a%2==0)
            System.out.println("Even");
        else
            System.out.println("odd");
    };
};
