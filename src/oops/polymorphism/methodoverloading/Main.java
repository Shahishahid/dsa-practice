package oops.polymorphism.methodoverloading;
class Calculator
{
    public int add(int a, int b)
{
    return a+b;
}

    public int add(int a, int b, int c)
    {
        return a+b+c;
    }
    public double add(double a, double b,double c,double
                      d)
    {
        return a+b;
    }

}
public class Main {
    public static void main(String[] args)
    {
        Calculator c=new Calculator();
        System.out.println( c.add(10,20));
        System.out.println(c.add(20,5,6));
        System.out.println(c.add(10.5,12.5,13.0,15.0));
    }
}
