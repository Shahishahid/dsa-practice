package oops.encapsulation;

public class Main {
    public static void main(String[] args)
    {
        Student s=new Student();

        s.setName("Beast");
        s.setAge(22);

        System.out.println("Name: "+s.getName());
        System.out.println("Age: "+s.getAge());
        System.out.println("After entering invalid input: ");
        s.setAge(121);//Will not get updated
        System.out.println("Age: "+s.getAge());



    }
}
