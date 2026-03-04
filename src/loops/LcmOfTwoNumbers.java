package loops;
import java.util.Scanner;
public class LcmOfTwoNumbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();

        System.out.print("Enter b: ");
        int b=sc.nextInt();
        int oa=a;
        int ob=b;
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        int LCM=oa*ob/a;
        System.out.println("LCM of "+oa+" and "+ob+": "+LCM);
    }
}
