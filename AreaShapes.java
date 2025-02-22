import java.util.Scanner;
class Shapes
{
    protected double area;
    public void calculate_area()
    {
        System.out.println("Area of Shapes");
    }
}
class square extends Shapes
{
    private int a;
    public void calculate_area()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = in.nextInt();
        area = a*a;
        System.out.println("Area of Square = " +area);
    }
}
class circle extends Shapes
{
    private double r;
    public void calculate_area()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter r: ");
        r = in.nextFloat();
        area = 3.14*r*r;
        System.out.println("Area of Circle = " +area);
    }
}
public class AreaShapes
{
    public static void main(String args[])
    {
        Shapes S1 = new square();
        S1.calculate_area();
        Shapes S2 = new circle();
        S2.calculate_area();
    }
}