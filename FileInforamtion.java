//Information abput files
import java.io.*;
import java.util.*;

class FileInforamtion
{
    public static void main(String arghs[])
    {
        System.out.println("Enter file name::");
        Scanner s=new Scanner(System.in);
        String fname=s.nextLine();
        File f=new File(fname);
        System.out.println("File existance::"+f.exists());
        System.out.println("Readable::"+f.canRead());
        System.out.println("Writable::"+f.canWrite());
        System.out.println("File length in bytes::"+f.length());

        try{
            FileInputStream fin=new FileInputStream("hira.txt");
            int i=0;
            while((i=fin.read())!=-1)
            {
                System.out.println((char)i);
            }
        }
        catch(Exception e)
        {

        }
    };
};
