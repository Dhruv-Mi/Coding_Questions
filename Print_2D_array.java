package com.company;

import java.util.Scanner;

public class Print_2D_array {
    public static void print2DArray(int[][] input){
        int row=input.length;
        int column=input[0].length;
        int i,j;
        for(i=0;i<row;i++){
            int n=row;
            n=n-i;
            while(n>0){
                for(j=0;j<column;j++){
                    System.out.print(input[i][j]+" ");
                }
                n--;
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row= sc.nextInt();
        int column= sc.nextInt();
        int[][] input=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                input[i][j]= sc.nextInt();
            }
        }
        print2DArray(input);
    }
}
