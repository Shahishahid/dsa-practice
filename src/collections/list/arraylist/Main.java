package collections.list.arraylist;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args)
    {
        ArrayList<Integer> a=new ArrayList<>();
        System.out.println("Added element in the list");
        a.add(1);
        System.out.println(a);
        System.out.println();

        System.out.println("After adding 2nd element in the list");
        a.add(5);
        System.out.println(a);
        System.out.println();

        System.out.println("After adding 3rd element in the list");
        a.add(10);
        System.out.println(a);
        System.out.println();

        System.out.println("Size: "+a.size());
        a.set(2,50);

        System.out.println();
        System.out.println("After Replace: "+a);

        System.out.println();
        System.out.println("Adding element in between the existing elements :");
        a.add(1,40);
        System.out.println(a);
        System.out.println();

        System.out.println("Printing specific element (index-2): "+a.get(2));
        System.out.println();

        System.out.println("Printing all elements: ");
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
        System.out.println();

        System.out.println("After removing element from the list: ");
        a.remove(2);
        System.out.println(a);
        System.out.println();

        System.out.println("Printing elements using for each: ");
        for(int x:a)
        {
            System.out.println(x);
        }

        System.out.println("To check element is in the list (30): "+a.contains(30));
        System.out.println("To check element is in the list (40): "+a.contains(40));

        System.out.println("isEmpty to check list is empty or not:"+a.isEmpty());
        System.out.println(a);

        a.remove(0);
        System.out.println(a);

        a.remove(0);
        System.out.println(a);

        a.remove(0);
        System.out.println(a);

        System.out.println("isEmpty to check list is empty or not:"+a.isEmpty());




    }
}
