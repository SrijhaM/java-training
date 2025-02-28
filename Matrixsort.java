import java.util.Arrays;
import java.util.Scanner;
class Matrixsort
{
    public static void main(String args[])
    {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the no. of rows : ");
    int row = in.nextInt();
    System.out.print("Enter the no. of columns : ");
    int col = in.nextInt();
    int [][] Matrix= new int[row][col];
    System.out.print("Enter the Elements: ");
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
            Matrix[i][j] = in.nextInt();
        }
    }
    int[] sorting = new int [row*col];
    int k = 0;
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
             sorting[k++]= Matrix[i][j];
        }
    }
    Arrays.sort(sorting);
    k = 0;
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
              Matrix[i][j]=sorting[k++];
        }
    }
    System.out.println("The Matrix: ");
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
            System.out.print(Matrix[i][j]+ " ");
        }
        System.out.println();
    }
    }
}
