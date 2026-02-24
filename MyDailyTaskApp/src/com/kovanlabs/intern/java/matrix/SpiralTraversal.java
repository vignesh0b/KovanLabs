package com.kovanlabs.intern.java.matrix;

public class SpiralTraversal {



    public static void main(String[] args){
        int[][] mat= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] res = spiralTraversal(mat);

        for(int[] row: res){
            for(int col: row){
                System.out.print(col +" ");
            }
            System.out.println();
        }

    }

    private static int[][] spiralTraversal(int[][] mat) {
        int n=mat.length;
        int[][] res = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                res[i][j] = mat[n-j-1][i];
            }
        }
        return res;
    }
}
