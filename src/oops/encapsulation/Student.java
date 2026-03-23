package oops.encapsulation;

public class Student
{
    private String name;
    private int age;

    public void setName(String name)
    {
        this.name=name;
    }

    public void setAge(int age)

    {
        if(age>0&&age<120)
        {
        this.age=age;
    }
        else {
            System.out.println("Invalid age");
        }

}
//get data
public String getName()
{
return name;
}
public int getAge()
{
    return age;
}
}