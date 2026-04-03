package collections.list.stack;
import java.util.Stack;
public class Stack1 {
    public static void main(String[] args)//Stack Extends vector so that stack inherits some properties of the Vector like remove(),get() etc...
    {
        Stack<Integer> s=new Stack<>();
        System.out.println("Adding elements: ");
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s);

        System.out.println("Accessing Top element: ");
        System.out.println(s.peek());

        System.out.println("Removing Top element: ");
        System.out.println(s.pop());

        System.out.println("Now the Top Elements is: ");
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println("Size of the stack: ");
        System.out.println(s.size());







    }
}
