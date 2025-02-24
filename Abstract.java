import java.util.Scanner;
abstract class Circle
{
    protected double area;
    abstract void calc_area();
}
class Abstract extends Circle
{
    private double r;
    public Abstract()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("value of r : ");
        r = in.nextInt();
    }
    void calc_area()
    {
        area = 3.14*r*r;
        System.out.print("Area = "+area);
    }
    public static void main(String args[])
    {
        Abstract obj = new Abstract();
        obj.calc_area();
    }
}