import java.util.Scanner;
class Automorphic
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = in.nextInt();
        int sq = n*n;
        System.out.println("Value is " +sq);
        int dig = String.valueOf(n).length();
        int ldig = sq %(int)Math.pow(10,dig);
        if(ldig == n)
        {
            System.out.println("It is Automorphic.");
        }
        else
        {
            System.out.println("It is not Automorphic.");
        }
    }
}