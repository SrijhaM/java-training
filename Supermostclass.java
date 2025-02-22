import java.util.Scanner;
class Supermost
{
    private int a;
    public void get()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("In Supermost Class");
    }
}
class Super extends Supermost
{
    protected void display()
    {
        System.out.println("In Super Class");
    }
}
class Sub extends Supermost
{
    static void display()
    {
        System.out.println("In Sub Class");
    }
}
class Supermostclass
{
    public static void main(String args[])
    {
        Sub obj = new Sub();
        obj.display();
        Super s = new Super();
        s.display();
        Supermost a = new Supermost();
        a.get();
    }
}