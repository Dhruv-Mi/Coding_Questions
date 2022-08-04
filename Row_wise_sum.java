package com.company;

import java.util.Scanner;

public class Row_wise_sum {
    public static void rowWiseSum(int[][] mat){
        int row= mat.length;
        int column=mat[0].length;
        int i,j;
        for(i=0;i<row;i++){
            int sum=0;
            for(j=0;j<column;j++){
                sum+=mat[i][j];
            }
            System.out.print(sum+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        int i;
        for(i=0;i<t;i++){
            int row= sc.nextInt();
            int column= sc.nextInt();
            if(row==0&&column==0){
                return;
            }
            int[][] input=new int[row][column];
            for (int j=0;j<row;j++){
                for(int k=0;k<column;k++){
                    input[j][k]= sc.nextInt();
                }
            }
            rowWiseSum(input);
            System.out.println();
        }
    }
}
