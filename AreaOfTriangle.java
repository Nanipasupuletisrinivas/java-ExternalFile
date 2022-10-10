import java.util.*;
import java.io.*;
class AreaOfTriangle
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("Enter height and base value::");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s1=br.readLine();
        int h=Integer.parseInt(s1);
        String s2=br.readLine();
        int b=Integer.parseInt(s2);
        System.out.println("Area of Triangle is::"+(b*h)/2);
    };
};
