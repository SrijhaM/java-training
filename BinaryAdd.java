import java.util.Scanner;
class BinaryAdd
{
    public String addBinary(String a, String b) 
    {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) 
        {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            result.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) result.append(carry);
        return result.reverse().toString();
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first binary string: ");
        String a = in.nextLine();
        System.out.print("Enter the second binary string: ");
        String b = in.nextLine();
        BinaryAdd obj = new BinaryAdd();
        String result = obj.addBinary(a, b);
        System.out.println("Sum of the binary strings: " + result);
    }
}
