public class BitSwap
{
   public static int swapbits(int n, int i, int j)
    {
        int biti = (n>>i) & 1;
        int bitj = (n>>j) & 1;
       
        if (biti != bitj)
        {
            n = n^(1 << i);
            n = n^(1 << j);
        }
        return n;
    }
    public static void main(String[] args)
    {
        int n = 29;
        int i = 1;  
        int j = 3;  
        System.out.println("Number: " + n);
        System.out.println("Binary form: " + Integer.toBinaryString(n));
        int swapnum = swapbits(n, i, j);
        System.out.println("After swapping bits: " + swapnum);
        System.out.println("Binary form: " + Integer.toBinaryString(swapnum));
    }
}