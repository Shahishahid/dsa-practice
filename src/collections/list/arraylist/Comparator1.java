package collections.list.arraylist;
import java.util.*;
//Descending order (largest to smallest)
public class Comparator1 {
    public static void main(String[] args)
    {
List<Integer> list=Arrays.asList(10,5,20);
Collections.sort(list,(a,b)->b-a);//b-a: lower to upper. a-b: upper to lower
        System.out.println(list);

    }
}
