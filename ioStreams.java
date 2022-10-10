import java.io.*;
class ioStreams
{
    public static void main(String args[])
    {
        System.out.println("Input output Streams");
        try
        {
            FileInputStream fin=new FileInputStream("hira.txt");
            int i=0;
            while((i=fin.read())!=-1)
            {
                System.out.print((char)i);
            }
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    };
};
