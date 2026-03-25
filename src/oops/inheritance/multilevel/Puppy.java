package oops.inheritance.multilevel;

public class Puppy extends Dog{
    public void sleep(){
        System.out.println("Puppy is Sleeping.");
    }
    public static void main(String[] args)
    {
        Puppy p=new Puppy();
        p.eat();
        p.sleep();
        p.bark();
    }
}
