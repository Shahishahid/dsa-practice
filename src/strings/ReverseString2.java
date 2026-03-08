package strings;
import java.util.Scanner;
public class ReverseString2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sentence=sc.nextLine();

        for(int i=sentence.length()-1;i>=0;i--)
        {
            System.out.print(sentence.charAt(i));
        }
    }
}