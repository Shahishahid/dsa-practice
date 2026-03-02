package conditions;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements: ");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i=i+2) {
            //if (i % 2 == 0) {
                sum = sum + a[i];

            }

       // }
        System.out.println("sum of all even numbers: " + sum);

    }
}
