package com.company;

import java.util.Scanner;

public class Determine_whether_matrix_can_be_obtained_by_rotation {
    public static boolean findRotation(int[][] a,int[][] b){
        int n=a.length;
        int c90=0,c180=0,c270=0,c0=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(b[i][j]==a[n-j-1][i])
                    c90++;
                if(b[i][j]==a[n-i-1][n-j-1])
                    c180++;
                if(b[i][j]==a[j][n-i-1])
                    c270++;
                if(b[i][j]==a[i][j])
                    c0++;
            }
        }

        return c90 == n * n || c270 == n * n || c180 == n * n || c0 == n * n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] mat=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]= sc.nextInt();
            }
        }
        int[][] target=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                target[i][j]= sc.nextInt();
            }
        }
        boolean ans=findRotation(mat,target);
        System.out.println(ans);
    }
}
