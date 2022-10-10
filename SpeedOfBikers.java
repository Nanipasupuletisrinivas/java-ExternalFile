//Speed Of Bikers
import java.io.*;
import java.util.*;
class SpeedOfBikers
{
    public static void main(String args[])
    {
        System.out.println("Enter 5 bikers speed::");
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        int avg=0,i;
        for(i=0;i<5;i++)
        {
            a[i]=s.nextInt();
        }
        for( i=0;i<5;i++)
        {
            avg=a[i]+avg;
        }

        for(i=0;i<5;i++)
        {
            if(a[i]>avg/5)
            {
                System.out.println("Bike Racer "+(i+1)+" is Qualified");
            }
        }

    };
};
