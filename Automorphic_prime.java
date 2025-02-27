import java.util.Scanner;
class Automorphic_prime
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the start value: ");
        int start = in.nextInt();
        System.out.print("Enter the end value: ");
        int end = in.nextInt();
        System.out.print("Number from "+start+"to "+end);
        System.out.println();
        for(int n = start;n<=end;n++)
        {
        int sq = n*n;
        int dig = String.valueOf(n).length();
        int ldig = sq %(int)Math.pow(10,dig);
        if(ldig == n)
        {
            System.out.println(n);
        }
        }  
    }
}