package oops.constructors.defaultconstructordefining;
class Student
{
    int id;
    String name;

    Student()
    {
        id=10;
        name="Default";
    }
}
public class Main {
    public static void main(String[] args)
    {
        Student s1=new Student();
        System.out.println("ID: "+s1.id);
        System.out.println("Name: "+s1.name);

    }
}
