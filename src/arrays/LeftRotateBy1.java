package arrays;
import java.util.Scanner;
public class LeftRotateBy1 {
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        //Store first element in a temporary variable
        int temp=a[0];
        //left shift the elements by 1
        for(int i=0;i<n-1;i++)
        {

            a[i]=a[i+1];

        }
        //store the first element at the end of the array
        a[n-1]=temp;
        System.out.println();
        System.out.println("Array after left rotation: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
