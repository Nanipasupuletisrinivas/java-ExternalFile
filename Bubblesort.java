//Bubble sort
import java.util.*;
import java.io.*;

class BubbleSort
{
    public static void main(String args[])
    {
        System.out.println("Enter array size::");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Enter elements Into Array::");
        int a[]=new int[100];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }


    };
};
