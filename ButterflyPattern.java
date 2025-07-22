import java.util.Scanner;
class ButterflyPattern 
{
     public static void main(String[] args)
      {
        int N = 5;
        int spaces = 2 * N - 1;
        int s = 0;
        for (int i = 1; i <= 2 * N - 1; i++) 
        {
            if (i <= N)
            {
                spaces = spaces - 2;
                s++;
            }
            else 
            {
                spaces = spaces + 2;
                s--;
            }
            for (int j = 1; j <= s; j++) 
            {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) 
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= s; j++) 
            {
                if (j != N) 
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
