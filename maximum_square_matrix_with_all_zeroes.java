package com.company;

import java.util.Scanner;

public class maximum_square_matrix_with_all_zeroes {
    public static int findMaxSquareWithAllZeroes(int[][] input){
        int[][] countZero=new int[input.length][input[0].length];
        int m=input.length;
        int n=input[0].length;
        for(int i=0;i<n;i++){
            if(input[0][i]==0){
                countZero[0][i]=1;
            }
            else{
                countZero[0][i]=0;
            }
        }
        for(int i=0;i<m;i++){
            if(input[i][0]==0){
                countZero[i][0]=1;
            }
            else{
                countZero[i][0]=0;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(input[i][j]==1){
                    countZero[i][j]=0;
                }
                countZero[i][j]=Math.min(countZero[i-1][j],Math.min(countZero[i-1][j-1],countZero[i][j=1]))+1;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(max<countZero[i][j]){
                    max=countZero[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[][] input=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                input[i][j]= sc.nextInt();
            }
        }
        int ans=findMaxSquareWithAllZeroes(input);
        System.out.println(ans);
    }
}
