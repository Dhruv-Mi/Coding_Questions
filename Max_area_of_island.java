package com.company;

import java.util.Scanner;

public class Max_area_of_island {
    public static int maxAreaOfIsland(int[][] grid){
        int m= grid.length;
        int n=grid[0].length;
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]>0){
                    ans=Math.max(ans,trav(i,j,grid));
                }
            }
        }
        return ans;
    }
    public static int trav(int i,int j,int[][] grid){
        if(i<0 || j<0 || i>= grid.length || j>=grid[0].length){
            return 0;
        }
        grid[i][j]=0;
        return 1+trav(i-1,j,grid)+trav(i,j+1,grid)+trav(i+1,j,grid)+trav(i,j-1,grid);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[][] grid=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]= sc.nextInt();
            }
        }
        int ans=maxAreaOfIsland(grid);
        System.out.println(ans);
    }
}
