package com.company;

import java.util.Scanner;

public class Minimum_path_sum {
    public static int minPathSum(int[][] grid){
        int m= grid.length;
        int n=grid[0].length;
        for(int i=m-2;i>=0;i--){
            grid[i][n-1]=grid[i][n-1]+grid[i+1][n-1];
        }
        for(int j=n-2;j>=0;j--){
            grid[m-1][j]=grid[m-1][j]+grid[m-1][j+1];
        }
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                grid[i][j]=grid[i][j]+Math.min(grid[i+1][j],grid[i][j+1]);
            }
        }
        return grid[0][0];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n= sc.nextInt();
        int[][] grid=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]= sc.nextInt();
            }
        }
        int ans=minPathSum(grid);
        System.out.println(ans);
    }
}
