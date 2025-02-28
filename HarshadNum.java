import java.util.Scanner;
class HarshadNum
{
    public static void main(String args[])
    {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the start value: ");
    int start = in.nextInt();
    System.out.print("Enter the end value: ");
    int end = in.nextInt();
    for(int num= start;num<=end;num++)
    {
    int rem = 0,sum = 0,s;
    int n=num;
    while(num>0)
    {
        rem = num%10;
        sum = sum + rem;
        num = num/10;
    }
    if(n%sum==0)
    {
        System.out.println(n+" is the Harshad Number.");
    }
    else
    {
        System.out.println(n+ " is not the Harshad Number." );
    }
    num=n;
    }
    }
}
