package searching;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter key element: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < a.length; i++)
        {
            if (key == a[i])
            {
                System.out.println("Key Element found at the index: "+i);
                found = true;
                break;
            }


        }
        if(!found)
        {
            System.out.println("Element not found");
        }

    }
}

