//Information about a file
import  java.io.*;
import java.util.*;

class Files
{
    public static void main(String args[])
    {
        System.out.println("Files in java");
        System.out.println("Enter file name::");
        Scanner s=new Scanner(System.in);
        String fname=s.nextLine();
        File f=new File(fname);
        System.out.println("File existance::"+f.exists());
        System.out.println("Write::"+f.canWrite());
        System.out.println("Redable::"+f.canRead());
        System.out.println("File type::txt");
        System.out.println("File length in  bytes::"+f.length());
    };
};
