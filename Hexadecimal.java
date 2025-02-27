import java.util.Scanner;
class Hexadecimal
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the temp value: ");
        int temp = in.nextInt();
        int rem;
        String hexa = "";
        while(temp>0)
        {
            rem = temp%16;
            hexa = rem+hexa;
            temp = temp/16;
        }
        System.out.print(hexa);
    }
}