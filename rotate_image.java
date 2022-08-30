package com.company;

import java.util.Scanner;

public class rotate_image {
    public static void rotate(int[][] matrix){
        int n= matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=n-1;j>=0;j--){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int[][] input=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                input[i][j]= sc.nextInt();
            }
        }
        rotate(input);
    }
}
