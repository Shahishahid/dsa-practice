package oops.inheritance.multiple;
interface A
{
    public void show();
}

interface B
{
    public void show();
}

 class C implements A,B
 {
     public void show()
     {
         System.out.println("This is class C");
     }
    public static void main(String[] args)
    {
C c=new C();
c.show();
}
}
