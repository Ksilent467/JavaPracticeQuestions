package JavaPractiveQuestions;

public abstract class AbstractConcept {
    public abstract void m1();
    public void m2()
    {
        System.out.println("This is Abstract class method 2");
    }
    public static void m3()
    {
        System.out.println("This is Abstract class static method 3");
    }

    public  abstract void m4();
}

class ChildAbstract extends AbstractConcept
{
    public void m1()
    {
        System.out.println("This is child class Abstract method 1");
    }

    public void m2()
    {
        System.out.println("This is child class method 2");
    }

    public static void m3()
    {
        System.out.println("This is child class static method 3");
    }

    @Override
    public void m4() {
        System.out.println("This is child class Abstract method 4");
    }

    public static void main(String args[])
    {
        AbstractConcept c= new ChildAbstract();
        c.m1();
        c.m2();
        m3();
        c.m4();
    }
}
