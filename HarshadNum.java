import java.util.Scanner;
class HarshadNum
{
    public static void main(String args[])
    {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int num = in.nextInt();
    int rem = 0,sum = 0,n;
    n=num;
    while(num>0)
    {
        rem = num%10;
        sum = sum + rem;
        num = num/10;
    }
    if(n%sum==0)
    {
        System.out.print(n+" is the Harshad Number.");
    }
    else
    {
        System.out.print(n+ " is not tthe Harshad Number." );
    }
    }
}