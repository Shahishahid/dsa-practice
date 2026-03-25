package oops.inheritance.hierarchical;

public class Cat extends Animal{
    public void sound(){
        System.out.println("From child class - Cat is Meowing");
    }
    public static void main(String[] args)
    {
        Cat c=new Cat();
        c.eat();
        c.sound();
    }
}
