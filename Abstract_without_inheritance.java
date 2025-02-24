import java.util.Scanner;
abstract class Abstract_without_inheritance
{
    static float area,circum,r;
    static void display()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("radius: ");
        r = in.nextInt();
    }
    static void calc_area()
    {
        area = 3.14f*r*r;
        System.out.println("Area of Circle = "+area);
        circum = 2*3.14f*r;
        System.out.println("Circumference of Circle = "+circum);
    }
    public static void main(String args[])
    {
        Abstract_without_inheritance.display();
        Abstract_without_inheritance.calc_area();
    }
}
