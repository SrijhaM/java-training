import java.util.Scanner;
class Starhash
{
    public static class Pattern
    {
    static int n = 5;
    public static void Triangle()
    {
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                if(j%2 == 0)
                {
                System.out.print(" #");
            }
            else
            {
                System.out.print(" *");
            }
            }
        System.out.println();
    }
}
}
public static void main(String args[])
{
   Pattern.Triangle(); 
}
}