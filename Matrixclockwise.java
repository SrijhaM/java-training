public class Matrixclockwise
{
    public static void rotateClockwise(int[][] matrix)
    {
        int N = matrix.length;
        for (int i = 0; i < N; i++)
        {
            for (int j = i; j < N; j++) 
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < N; i++)
        {
            int l=0, r=N-1;
            while (l<r) 
            {
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }
    }
    public static void rotateCounterclockwise(int[][] matrix)
    {
        int N = matrix.length;
        for (int i=0; i<N; i++)
        {
            for (int j=i; j<N; j++) 
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int j=0; j<N; j++)
        {
            int t=0, b=N-1;
            while (t<b)
            {
                int temp = matrix[t][j];
                matrix[t][j] = matrix[b][j];
                matrix[b][j] = temp;
                t++;
                b--;
            }
        }
    }
    public static void printMatrix(int[][] matrix)
    {
        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[i].length; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);
        rotateClockwise(matrix);
        System.out.println("Matrix after rotating 90 degrees clockwise:");
        printMatrix(matrix);
        rotateCounterclockwise(matrix);
        System.out.println("Matrix after rotating 90 degrees counterclockwise:");
        printMatrix(matrix);
    }
}
