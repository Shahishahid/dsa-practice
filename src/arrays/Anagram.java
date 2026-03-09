package arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String s1=sc.nextLine().toLowerCase();//Converts all characters to lower case

        System.out.print("Enter String 2: ");
        String s2=sc.nextLine().toLowerCase();//

        if(s1.length()!=s2.length())
        {
            System.out.println("Not an Anagram.");
            return;
        }
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
       if( Arrays.equals(a,b))//checks if every element of a is equal to b
       {
           System.out.println("Is Anagram.");
       }
       else
       {
           System.out.println("Not Anagram");
       }
    }
}
