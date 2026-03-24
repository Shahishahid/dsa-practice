package oops.inheritance.in1;

public class Car extends Vehicle{
    public void display()
    {
        start();
    }
    public static void main(String[] args)
    {
        Vehicle v=new Vehicle();//Parent object creation
        Vehicle cv=new Car();//reference type is vehicle(parent) where as object type is of car(child)
        Car c=new Car();//Child object creation
        c.display();
        System.out.println("Speed: "+c.getSpeed());
        System.out.println("Speed: "+v.getSpeed());
        System.out.println("Speed: "+cv.getSpeed());
    }
}
