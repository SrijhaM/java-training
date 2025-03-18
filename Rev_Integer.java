import java.util.Scanner;
class Rev_Integer
{
    public int rev(int x) 
    {
        int sign = x < 0 ? -1 : 1;
        x *= sign;
        int rev = 0;
        while (x > 0) 
        {
            int digit = x % 10;
            x /= 10;
            if (rev > (Integer.MAX_VALUE - digit) / 10)
            {
                return 0;
            }
            rev = rev * 10 + digit;
        }
        return rev * sign;
    }
    public static void main(String[] args)
     {
        Rev_Integer obj = new Rev_Integer();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int x = in.nextInt();
        System.out.print("Reversed integer: " + obj.rev(x));
    }
}