import java.util.Arrays;
import java.util.Scanner;
class ArrayScanner
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter the String:");
        int n = in.nextInt();
        int[] a =new int[n];
        for (int i=0; i< a.length;i++)
        {
        a[i] = in.nextInt();
        }
        System.out.print(Arrays.toString(a));
    }
} 