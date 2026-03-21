package recursion;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println(fibon(n));

    }
     public static int fibon(int n)
     {
         int fib=1;
         if(n==1)
         {
             return 1;
         }
         return n+fibon(n-1);


     }

}
