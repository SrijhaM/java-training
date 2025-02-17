import java.util.Scanner;

public class CountOccurence
{
    public static void main(String[] args) {
       
        String numStr = "12346578899756456712";
        int[] count = new int[10];
       
        for (char digit : numStr.toCharArray()) {
            count[digit - '0']++;
        }
       
       
        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {
                System.out.print(i + ":" + count[i] + " ");
                System.out.println();
            }
        }
       
       
    }
}
