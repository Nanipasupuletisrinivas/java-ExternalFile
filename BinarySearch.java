import java.io.*;
import java.util.*;
class BinarySearch
{
    public static void main(String args[])
    {
        System.out.println("Enter array size::");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        System.out.println("Enter elements into array in ascending order::");
        int a[]=new int[10];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        System.out.println("Enter key element::");
        int k=s.nextInt();
        int mid,low=0,high=n-1;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(a[mid]==k)
            {
                System.out.println("Key element is found "+k);
                break;
            }
            else if(a[mid]<k)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }

        }

    };
};
