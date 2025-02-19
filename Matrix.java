import java.util.Scanner;
class Matrix
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter the number of rows:");
        int row = in.nextInt();
        System.out.print("Enter the number of columns:");
        int col = in.nextInt();
        int[][] Matrix = new int[row][col];
        System.out.print("Entern the elements :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
        {
            Matrix [i][j] = in.nextInt();
        }
        }
        System.out.println("The matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(Matrix [i][j]+" ");
            }
            System.out.println();
        }
    }
} 