package com.company;

import java.util.Scanner;

public class Shortest_path_in_binary_matrix {
    public static int shortestPathBinaryMatrix(int[][] grid){
        if(grid[0][0]==1 || grid[grid.length-1][grid.length-1]==1){
            return -1;
        }
        int[][] dp=new int[grid.length][grid.length];
        for(int i=0;i< grid.length;i++){
            for (int j=0;j< grid.length;j++){
                dp[i][j]=-1;
            }
        }
        int ans= shortestPathBinaryMatrixHelper(grid,0,0,dp);
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return ans;
        }
    }
    public static int shortestPathBinaryMatrixHelper(int[][] grid,int i,int j,int[][] dp){
        int n= grid.length;
        if(i==n-1 && j==n-1){
            return 1;
        }
        if(i>=n || j>=n || i<0 || j<0){
            return Integer.MAX_VALUE;
        }
        if(grid[i][j]==1){
            dp[i][j]=Integer.MAX_VALUE;
            return Integer.MAX_VALUE;
        }
        else{
            if(dp[i][j]!=-1){
                return dp[i][j];
            }
            int ans1=shortestPathBinaryMatrixHelper(grid,i+1,j,dp);
            int ans2=shortestPathBinaryMatrixHelper(grid,i,j+1,dp);
            int ans3=shortestPathBinaryMatrixHelper(grid,i+1,j+1,dp);
            int temp=Math.min(ans1,Math.min(ans2,ans3));
            if(temp==Integer.MAX_VALUE){
                dp[i][j]=Integer.MAX_VALUE;
            }
            else{
                dp[i][j]=1+temp;
            }
            return dp[i][j];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] grid=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]= sc.nextInt();
            }
        }
        int ans=shortestPathBinaryMatrix(grid);
        System.out.println(ans);
    }
}
