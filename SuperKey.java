class Super
{
    int x;
    public Super()
    {
        x =10;
    }
    public void display()
    {
        System.out.println("Inside Superclass & x =" +x);
    }
}
class Sub1 extends Super
{
    int x;
    public Sub1()
    {
        super();
        x = 100;
    }
    public void display()
{
    System.out.println("Sub class & x =" +x);
    System.out.println("Superclass x =" + super.x);
    super.display();
}
}
public class SuperKey
{
    public static void main(String args[])
    {
        Sub1 obj = new Sub1();
        obj.display();
    }
}