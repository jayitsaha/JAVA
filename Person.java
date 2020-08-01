package hackerrank;

/**
 *
 * @author Jayit
 */


public abstract class Person
{
    String name;
    public Person(String n)
    {
        name=n;
    }
    void see()
    {
        System.out.println("The name is "+name);
    }
}


