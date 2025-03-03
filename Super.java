class Shape
{
    public void area()
    {
        System.out.print("Area");
    }
}
class Rectangle extends Shape
{
    float length, breadth;
    public Rectangle(float l, float b)
    {
        this.length = l;
        this.breadth = b;
    }
        @Override 
        public void area()
        {
        float area = length*breadth;
        System.out.println("Area of Rectangle = " +area);
    
    }
}
class Super
{
    public static void main(String args[])
    {
        Rectangle obj = new Rectangle(12.0f,13.0f);
        obj.area();
    
    }
}