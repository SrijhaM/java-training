import java.util.Scanner;
class TransposeArr
{
    public static void main(String args[])
    {
        int[][] arr={
            {1,6,7},
            {9,8,15},
            {21,8,14} 
        };
        int m=arr.length;
        int n=arr[0].length;
        int[][] transposeArr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
transposeArr[i][j] = arr[j][i];
            }
        } 
        for(int[] row: transposeArr)
        {
            for(int val: row)
            {
                System.out.print(val+ " ");
            }
            System.out.println();
        }     
    }
}