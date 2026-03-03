package arrays;
import java.util.Scanner;
public class FrequencyOfElementInArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter element to find its frequency: ");
        int frequencyelement=sc.nextInt() ;
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(frequencyelement==a[i])
            {
                count++;
            }

        }
        if(count==0)
        {
            System.out.println("Element does not exists.");

        }
        else {
            System.out.println("Frequency of " + frequencyelement + ": " + count);
        }
    }
}
