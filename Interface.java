import java.util.Scanner;
interface Interfaceclass
{
    static int n=5;
    static void display()
    {
        System.out.println("Static Method");
    }
    default void display1()
    {
        System.out.println("Default Method");
    }
}
public class Interface implements Interfaceclass
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Value of n: ");
        int n = in.nextInt();
        Interface obj = new Interface();
        obj.display1();
        Interfaceclass.display();
    }
}