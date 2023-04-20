package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shift_2D_grid {
    public static List<List<Integer>> shiftGrid(int[][] grid,int k){
        int m= grid.length;
        int n=grid[0].length;
        for(int s=0;s<k;s++){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(j+1<n){
                        int temp=grid[i][j];
                        grid[i][j]=grid[i][j+1];
                        grid[i][j+1]=temp;
                    }
                    if(i+1<m){
                        int temp=grid[i][n-1];
                        grid[i][n-1]=grid[i+1][0];
                        grid[i+1][0]=temp;
                    }
                }
            }
            int temp=grid[m-1][n-1];
            grid[m-1][n-1]=grid[0][0];
            grid[0][0]=temp;
        }
        List<List<Integer>> ans=new ArrayList<>();
        for (int[] ints : grid) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                temp.add(ints[j]);
            }
            ans.add(temp);
        }
        return ans;
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
        int k= sc.nextInt();
        List<List<Integer>> ans=shiftGrid(grid,k);
        for (List<Integer> an : ans) {
            for (Integer integer : an) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
