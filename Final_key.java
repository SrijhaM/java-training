class Shapes
{
    public void area()
    {
        System.out.println("Area of Shapes");
        System.out.println();
    }
}
class Square extends Shapes
{
    final int a = 6;
    public int area;
    public void square()
    {
        area = a*a;
        System.out.println("Area of Square = "+area);
    }
}
class Rectangle extends Shapes
{
    final int l=2,b=8;
    public int area;
    public void rec()
    {
        area = l*b;
        System.out.println("Area of Rectangle = "+area);
    }
}
class Triangle extends Shapes
{
    final int l=2,b=4;
    public float area;
    public void tri()
    {
        area = 0.5f*l*b;
        System.out.println("Area of Triangle = "+area);
    }
}
class Circle extends Shapes
{
    final int r = 6;
    public float area;
    public void cir()
    {
        area = 3.14f*r*r;
        System.out.println("Area of Circle = "+area);
    }
}
class Final_key
{
    public static void main(String args[])
    {
        Shapes obj = new Shapes();
        obj.area();
        Square a = new Square();
        a.square();
        Rectangle b = new Rectangle();
        b.rec();
        Triangle c = new Triangle();
        c.tri();
        Circle d = new Circle();
        d.cir();
    }
}