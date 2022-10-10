//String Buffer class
import java.util.*;
import java.io.*;

class StringBufferClass
{
    public static void main(String args[])
    {
        StringBuffer s1=new StringBuffer("Hello Ramesh");
        System.out.println(s1.delete(0,6));
        StringBuffer s2=new StringBuffer("Hi Nani You are ");
        System.out.println(s2.insert(16,"Great"));
    };
};
