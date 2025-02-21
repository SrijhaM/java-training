import java.util.Scanner;
class Add
{
    private int a,b,c;
    public void sum()
    {
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=a+b;
        System.out.println("Sum" +c);
    }
}
class Main_Sum
{
    public static void main(String args[])
    {
        Add obj = new Add();
        obj.sum();
    }
}