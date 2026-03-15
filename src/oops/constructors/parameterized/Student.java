package oops.constructors.parameterized;

public class Student {
    int id;
    String name;
    Student(int i,String n)
    {
        name=n;
        id=i;
        System.out.println("My name is "+name+".");
        System.out.println("ID: "+id);
    }
}
