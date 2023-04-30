package com.company;

import java.util.Scanner;

public class Count_negative_number_in_a_sorted_matrix {
    public static int countNegative(int[][] grid){
        int ans=0;
        for (int[] ints : grid) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                int value = ints[j];
                if (value < 0) {
                    ans++;
                } else {
                    break;
                }
            }
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
                grid[i][j]=sc.nextInt();
            }
        }
        int ans=countNegative(grid);
        System.out.println(ans);
    }
}
