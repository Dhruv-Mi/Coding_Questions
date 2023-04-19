package com.company;

import java.util.Scanner;

public class Cells_with_odd_value_in_a_matrix {
    public static int oddCells(int m,int n,int[][] indices){
        int[][] temp=new int[m][n];
        for (int[] index : indices) {
            int row = index[0];
            int col = index[1];
            for (int j = 0; j < n; j++) {
                temp[row][j]++;
            }
            for (int k = 0; k < m; k++) {
                temp[k][col]++;
            }
        }
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(temp[i][j]%2!=0){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int r= sc.nextInt();
        int c= sc.nextInt();
        int[][] indices=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                indices[i][j]= sc.nextInt();
            }
        }
        int ans=oddCells(m,n,indices);
        System.out.println(ans);
    }
}
