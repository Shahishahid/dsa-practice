package loops;
import java.util.Scanner;

//Take an input
//Store it in a variable(original)
//count number of digits
//Extract digits
// calculate power sum


class ArmStrongNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int original=n;

        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        System.out.print("number of digits are: "+count);

        System.out.println();
        n=original;
        int sum=0;
while(n!=0)
{
    int digit=n%10;
    int power=1;
    //calculate digit count manually
    for(int i=1;i<=count;i++)
    {
        power=power*digit;
    }
    sum=sum+power;
    n=n/10;
}
if(sum==original)
{
    System.out.print(original+ " is an ArmStrongNumber. ");
}
else {
    System.out.print(original+ " is not an ArmStrongNumber. ");
}

    }
}