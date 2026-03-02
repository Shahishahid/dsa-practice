package strings;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence=sc.nextLine();

        String[] words=sentence.split(" ");//split() converts sentence into words.
        for (int i=words.length-1;i>=0;i--)//Traverse from end to beginning.
        {
            System.out.print(words[i]+ " ");
        }

    }
}
