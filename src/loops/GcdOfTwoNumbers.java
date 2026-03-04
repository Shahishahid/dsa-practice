package loops;
import java.util.Scanner;
public class GcdOfTwoNumbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a=sc.nextInt();

        System.out.print("Enter value of b: ");
        int b=sc.nextInt();
int oa=a;
int ob=b;
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("GCD of "+oa+" and "+ob+": "+a);

    }
}
