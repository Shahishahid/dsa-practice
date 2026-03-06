package sorting;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter elements to be sorted: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int pass = 0; pass < n; pass++) //Passes less than elements are compared.
        {
            for (int i = 0; i < n - pass - 1; i++)
            {
                if (a[i] > a[i + 1])//Adjacent elements are compared and swapped if condition is met.
                {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        System.out.println("Elements after Bubble Sort: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        }
    }

