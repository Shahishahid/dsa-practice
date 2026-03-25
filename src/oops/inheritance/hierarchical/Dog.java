package oops.inheritance.hierarchical;

public class Dog extends Animal{
    public void sound()
    {
        System.out.println("From child class - Dog is Barking.");
    }
    public static void main(String[] args)
    {
        Dog d=new Dog();
        d.eat();
        d.sound();
    }
}
