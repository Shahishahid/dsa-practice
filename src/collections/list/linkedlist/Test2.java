package collections.list.linkedlist;

import java.util.LinkedList;

public class Test2 {
    public static void main(String[] args)
    {
        LinkedList<Integer> ll=new LinkedList<>();
        System.out.println("Linked list after adding elemets: ");
        ll.add(12);
        ll.add(37);
        ll.add(24);
        ll.add(53);
        ll.add(123);
        System.out.println(ll);

        System.out.println("Accessing specific element(index - 2): ");
        System.out.println(ll.get(2));//O(n)

        System.out.println("Deleting the first and last element: ");
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        System.out.println(ll);

        System.out.println("Adding the first and last element: ");
        ll.addLast(4);
        ll.addFirst(0);
        System.out.println(ll);

        System.out.println("Accessing the first and last element: ");
        System.out.println( ll.getFirst());
        System.out.println( ll.getLast());
        System.out.println(ll);

        System.out.println("Removing specif element(index - 4): ");
        ll.remove(4);
        System.out.println(ll);

        System.out.println("Removing elements tht satisfies the condition using removeIf(): ");
        ll.removeIf(x->x%2==0);
        System.out.println(ll);
    }



}
