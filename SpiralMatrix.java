public class SpiralMatrix
{
    public static void spiral(int[][] matrix)
    {
        if (matrix==null || matrix.length==0 || matrix[0].length==0)
        {
            return;
        }
        int M = matrix.length;
        int N = matrix[0].length;
        int t = 0, b = M-1, l=0, r=N-1;
        while (t<=b && l<=r)
        {
            for (int i=l; i<=r; i++) 
            {
                System.out.print(matrix[t][i] + " ");
            }
            t++;
            for (int i=t; i<=b; i++)
            {
                System.out.print(matrix[i][r] + " ");
            }
            r--;
            if (t<=b)
            {
                for (int i=r; i>=l; i--)
                {
                    System.out.print(matrix[b][i] + " ");
                }
                b--;
            }
            if (l<=r)
            {
                for (int i=b; i>=t; i--) 
                {
                    System.out.print(matrix[i][l] + " ");
                }
                l++;
            }
        }
    }
    public static void main(String[] args) 
    {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println("Spiral Order of the Matrix:");
        spiral(matrix);
    }
}
