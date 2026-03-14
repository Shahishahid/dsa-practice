package arrays;
import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 2D array row size: ");
        int row=sc.nextInt();
        System.out.print("Enter 2D array column size: ");
        int col=sc.nextInt();

        int[][] a=new int[row][col];
        int[][] b=new int[row][col];
        int[][] sum=new int[row][col];





        System.out.println("Enter elements of matrix a: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of matrix b: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
for(int i=0;i<row;i++)
{
    for(int j=0;j<col;j++)
    {
        sum[i][j]=a[i][j]+b[i][j];
    }
}
        System.out.println("Result: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }


    }
}
