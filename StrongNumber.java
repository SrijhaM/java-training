import java.util.Scanner;
class StrongNumber 
{
    static int n,s,temp,fact=1,sum=0;
    static void num()
    {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    n = in.nextInt();
    System.out.println("Factorial of each digits");
    temp = n;
    while(temp>0)
    {
        fact = 1;
        s = temp%10; 
        for( int i = 1; i<=s; i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);
        sum = sum+fact;
        temp = temp/10;
    }
    System.out.println();
    System.out.println("Sum of the factorial is "+sum);
    System.out.println();
    if(sum == n)
    {
        System.out.print(n+" is a Strong Number.");
    }
    else
    {
        System.out.print(n+" is not a Strong Number.");
    }
    }
    public static void main(String args[])
    {
        num();
    }
}