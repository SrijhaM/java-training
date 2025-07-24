import java.util.Scanner;
class KaprekarNum
{
    public static boolean kaprekar(int n)
    {
        if(n==1) return true;
        if(n<1) return false;
        long sq = (long)n*n;
        String result = Long.toString(sq);
        for(int i=1; i<result.length();i++)
        {
            String left = result.substring(0,i);
            String right = result.substring(i);
            int leftnum = Integer.parseInt(left);
            int rightnum = Integer.parseInt(right);
            if(leftnum+rightnum == n)
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = in.nextInt();
        if(kaprekar(n))
        {
            System.out.print("KAPREKAR NUMBER");
        }
        else
        {
            System.out.print("NON KAPREKAR NUMBER");
        }
    }
}