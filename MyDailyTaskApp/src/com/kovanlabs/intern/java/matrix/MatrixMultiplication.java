package com.kovanlabs.intern.java.matrix;

import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args){

        int mat1[][] ={{1,2,3},
                        {1,2,3},
                        {1,2,3}
        };

        int mat2[][] = {{1,2,3},
                {1,2,3},
                {1,2,3}};

        int res[][] = new int[3][3];

        matrixMultiplication(mat1, mat2, res);

        for(int[] row: res){
            for(int col: row){
                System.out.print(col +" ");
            }
            System.out.println();
        }

    }

    private static void matrixMultiplication(int[][] mat1, int[][] mat2, int[][] res) {
        int n=mat1.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                res[i][j]=0;
                for(int k=0; k<n; k++){
                    res[i][j]+= mat1[i][k]*mat2[k][j];
                }
            }
        }
    }
}
