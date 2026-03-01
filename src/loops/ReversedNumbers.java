package loops;
import java.util.Scanner;

public class ReversedNumbers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int n=sc.nextInt();

        int rev=0;
        while(n!=0)
        {
            int lastDigit = n % 10;     //extract last digit
            rev= rev * 10 + lastDigit;   //Store the reversed digit
            n= n / 10;                 //remove last digit from n
        }
        System.out.println("Reversed Number: "+rev);
    }
}