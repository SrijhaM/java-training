import java.util.Scanner;
class Palindrome_num
{
    public boolean isPalindrome(int x)
    {
        if (x<0)
        {
            return false;
        }
        int rev=0;
        int a=x;
        while (x>0) 
        {
            rev=rev*10+x%10;
            x/=10;
        }
        return a==rev;
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = in.nextInt();
        Palindrome_num solution = new Palindrome_num();
        System.out.print(solution.isPalindrome(n));
    }
}