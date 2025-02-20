import java.util.Scanner;
class Car
{
    String Brand;
    Car()
    {
        Brand = "Unknown";
        System.out.println("Default constructor called");
    }
    String SetBrand()
    {
        Brand = "Toyota";
        return Brand;
    }
    void display()
    {
        System.out.println("Brand :" +Brand);
    }
    public static void main(String args[])
    {
        Car c = new Car();
        c.display();
        c.SetBrand();
        c.display();
    }
}