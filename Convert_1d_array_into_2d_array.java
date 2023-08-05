package com.company;

import java.util.Scanner;

public class Convert_1d_array_into_2d_array {
    public static int[][] construct2DArray(int[] original,int m,int n){
        int[][] ans=new int[m][n];
        if(m*n== original.length) {
            int i = 0;
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    ans[j][k] = original[i];
                    i++;
                }
            }
            return ans;
        }
        return new int[0][0];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int[] original=new int[size];
        for(int i=0;i<size;i++){
            original[i]= sc.nextInt();
        }
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[][] ans=construct2DArray(original,m,n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
