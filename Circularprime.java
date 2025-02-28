public class Circularprime 
{
    public static void main(String[] args)
    {
        int n = 1193;
        int temp = n;
        boolean Circularprime = true;
        int len = String.valueOf(n).len();

        for (int i = 0; i < len; i++)
        {
            if (!prime(temp))
            {
                Circularprime = false;
                break;
            }
            temp = rotateNumber(temp, len);
        }

        if (Circularprime) 
        {
            System.out.println(n + " is a Circular Prime.");
        }
        else 
        {
            System.out.println(n + " is not a Circular Prime.");
        }
    }

    static boolean prime(int n)
    {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n);i++) 
        {
            if (n % i == 0) return false;
        }
        return true;
    }

    static int rotateNumber(int n, int len)
    {
        int lastDigit = n % 10;
        n = n / 10;
        return lastDigit * (int) Math.pow(10, len - 1) + n;
    }
}