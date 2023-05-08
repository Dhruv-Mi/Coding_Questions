package com.company;

import java.util.Scanner;

public class Matrix_diagonal_sum {
    public static int diagonalSum(int[][] mat){
        int n= mat.length;
        int ans=0;
        for(int i=0;i<n;i++){
            ans=ans+mat[i][i];
        }
        int j=0;
        for(int i=n-1;i>=0;i--){
            if(i!=j){
                ans=ans+mat[i][j];
            }
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] mat=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int ans=diagonalSum(mat);
        System.out.println(ans);
    }
}
