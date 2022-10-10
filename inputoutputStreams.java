//input and output streams
import java.io.*;
class inputoutputStreams
{
    public static void main(String args[])
    {
        System.out.println("Input and output streams");
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

        }
    };
};
