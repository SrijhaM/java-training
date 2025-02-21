import java.util.Scanner;
class Calculator
{
    public void Add()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = in.nextInt();
        System.out.print("Enter the value of b:");
        int b = in.nextInt();
        int c = a+b;
        System.out.println("Sum = " +c);
    }
    public int Sub()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = in.nextInt();
        System.out.print("Enter the value of b:");
        int b = in.nextInt();
        int c = a-b;
        return c;
    }
    public void Product(int a, int b)
{
       int c = a*b;
        System.out.println("Product = " +c);
}
    public int Div(int a,int b)
{
        int c = a/b;
        return c;
}
}
class Calculatorc
{
    public static void main(String args[])
    {
        Calculator obj = new Calculator();
        obj.Add();
        int s=obj.Sub();
        System.out.println("Sub:"+s);
        obj.Product(2,4);
        int d = obj.Div(10,5);
        System.out.print("Div = " +d);
    }
}

    
    