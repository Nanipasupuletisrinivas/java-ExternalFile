import java.io.*;
class AllPrimitiveDataTypes
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter byte value::");
        String s1=br.readLine();
        byte a=Byte.parseByte(s1);
        System.out.println(" byte value is::"+a);
        System.out.println("Enter integer value::");
        String s2=br.readLine();
        int b=Integer.parseInt(s2);
        System.out.println("Integer value is::"+b);
        System.out.println("Enter Floating point value::");
        String s3=br.readLine();
        float c=Float.parseFloat(s3);
        System.out.println("Float value is::"+c);
        System.out.println("Enter Double value::");
        String s4=br.readLine();
        double d=Double.parseDouble(s4);
        System.out.println("Double value is ::"+d);
        System.out.println("Enter long value::");
        String s5=br.readLine();
        long e=Long.parseLong(s5);
        System.out.println("Long value is::"+e);

        System.out.println("Enter boolean value::");
        String s7=br.readLine();
        boolean f=Boolean.parseBoolean(s7);

        System.out.println("Boolean value is::"+f);
        System.out.println("Enter short value::");
        String s8=br.readLine();
        System.out.println("Enter Short value::");
        short g=Short.parseShort(s8);
        System.out.println("short value is::"+g);




    };
};
