import java.util.Scanner;
class Rightangle 
{
    public void triangle()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }System.out.println("Right angle Triangle");
   }
}
class Leftangle
{
    public void triangle()
    {
       int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }System.out.print("Left angle Triangle");
   }
}
class Maintriangle
{
    public static void main(String args[])
    {
        Rightangle obj = new Rightangle();
        obj.triangle();
        System.out.println();
        Leftangle a = new Leftangle();
        a.triangle();
    }
}

