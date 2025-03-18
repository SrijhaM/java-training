import java.util.Arrays;
import java.util.Scanner;
class Bubblesort
{
    static void bubblesort(int arr[])
    {
     int n = arr.length;
     for (int i = 0; i< n-1;i++)
        for (int j = 0; j<n-i-1;j++)
        if (arr[j] > arr[j+1])
        {
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a[] = { 2,5,4,10 };
        Bubblesort.bubblesort(a);
        System.out.print("The Bubble sort is ");
        System.out.println(Arrays.toString(a));
    }
}