package com.company;

import java.util.Scanner;

public class Toeplitz_matrix {
    public static boolean isToeplitzMatrix(int[][] matrix){
        int m= matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m-1;i++){
            for(int j=0;j<n-1;j++){
                if(matrix[i][j]!=matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[][] matrix=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        boolean ans=isToeplitzMatrix(matrix);
        System.out.println(ans);
    }
}
