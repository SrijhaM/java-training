import java.util.Scanner;
class Octal
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the temp value: ");
        int temp = in.nextInt();
        int rem;
        String oct = "";
        while(temp>0)
        {
            rem = temp%8;
            oct = rem+oct;
            temp = temp/8;
        }
        System.out.print(oct);
    }
}