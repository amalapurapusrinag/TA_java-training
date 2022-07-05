package com.epam.rd.autotasks.matrices;
import java.util.Arrays;


public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {


        //Put your code here
        if(matrix.length>0)
        {
            int m = matrix.length;
            int n = matrix[0].length;
            int[][] transposedMatrix = new int[n][m];


            for(int x = 0; x < n; x++)
            {
                for(int y = 0; y < m; y++)
                {
                    transposedMatrix[x][y] = matrix[y][x];
                }
            }


            return transposedMatrix;
        }
        else
        {
            return null;
        }

    }


    public static void main(String[] args) {


        System.out.println("Test your code here!\n");


        // Get a result of your code


        int[][] matrix = {
                {1, 2},
                {7, -13} };


        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }


}
