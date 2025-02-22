import java.util.Scanner;
class Super
{
    static void display()
    {
        System.out.println("In Super Class");
    }
}
class Sub extends Super
{
    static void display()
    {
        System.out.println("In Sub Class");
    }
}
class Superclass
{
    public static void main(String args[])
    {
        Super obj = new Sub();
        obj.display();
    }
}