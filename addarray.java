public class addarray
{
    public static void main(String[] args)
    {
        String a = "987654319";
        String b = "12345891236";
        String result = addLargeNumbers(a, b);
        System.out.println("Sum: " + result);
    }

    public static String addLargeNumbers(String a, String b) {
        StringBuilder result = new StringBuilder();
       
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int d1 = (i >= 0) ? a.charAt(i) - '0' : 0;
            int d2 = (j >= 0) ? b.charAt(j) - '0' : 0;
           
            int sum = d1 + d2 + carry;
            carry = sum / 10;  
            result.append(sum % 10);
         
            i--;
            j--;  
        }
        return  result.reverse().toString();
    }
}