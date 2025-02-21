import java.util.Scanner;
class Add
{
    private int a,b,c;
    private void Sum()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value a: ");
        a = in.nextInt();
        System.out.print("Enter the value b: ");
        b = in.nextInt();
    }
    public void sum()
    {
        Sum();
        c = a+b;
        System.out.print("Sum = " +c);
    }
}
public class Method
{
    public static void main(String args[])
    {
        Add obj = new Add();
        obj.sum();
    }
}