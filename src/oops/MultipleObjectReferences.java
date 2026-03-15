package oops;

public class MultipleObjectReferences {
    public static void main(String[] args)
    {
        ClassExample c1=new ClassExample();
        ClassExample c2=new ClassExample();
        c1.id=201;
        c1.name="Abdul";
        c2.id=202;
        c2.name="Shameer";
        c1.display();
        c2.display();
    }
}
