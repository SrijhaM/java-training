import java.util.Arrays;
class Thirdmax
{
    public static int getThird(int[][] a, int rows, int cols)
    {
        int total = rows * cols;
        int[] c = new int[total];
        int b = 0;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++) 
            {
                c[b++] = a[i][j];
            }
        }
        int temp;
        for (int i = 0; i < total; i++) 
        {
            for (int j = i + 1; j < total; j++) 
            {
                if (c[i] > c[j]) {
                    temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        return c[total - 3];
    }
    public static void main(String args[]) 
    {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.print("Third Maximum value in a = " + getThird(a, 2, 3));
    }
}
