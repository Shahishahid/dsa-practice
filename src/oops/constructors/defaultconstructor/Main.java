package oops.constructors.defaultconstructor;
//Here java provides a constructor automatically
class Student
{
int id;
String name;

//no Student() constructor is defined
}
public class Main {
    public static void main(String[] args)
    {
        Student s1=new Student();

        System.out.println("ID: "+s1.id);
        System.out.println("Name: "+s1.name);

    }
}
