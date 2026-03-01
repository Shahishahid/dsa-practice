package loops;

class NumbeDiamondPattern {
    public static void main(String[] args)
    {




        /*UPPER
            space = n-i
            number =i

          LOWER
            space = i
            number = n-i*/

        int n=5;
        //Upper Part
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        //Lower Part
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
