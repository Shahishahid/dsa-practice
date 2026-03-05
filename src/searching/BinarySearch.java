package searching;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
int[] a=new int[n];
        System.out.println("Enter sorted elements: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Enter key element: ");
        int key=sc.nextInt();
        int low=0;
        int high=n-1;
        boolean found=false;
        int mid;
        while(low<=high)
        {
             mid=(low+high)/2;
            if(a[mid]==key)
            {
                System.out.println("Element found at index: "+mid);
                found=true;
                break;
            }
            else if(a[mid]<key)
            {
                low=mid+1;
            }
            else {
                high=mid-1;
            }

        }
        if(!found)
        {
            System.out.println("Element not found");

        }

    }
}
