import java.util.Scanner;
class data
{
    public int a,b,c;
    public void display()
    {
        System.out.println("Sum value = " +c);
    }
    public static void main(String args[])
    {
        data obj = new data();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        obj.a = in.nextInt();
        System.out.print("Enter the value of b: ");
        obj.b = in.nextInt();
        obj.c = obj.a+obj.b;
        obj.display();
    }
        
}