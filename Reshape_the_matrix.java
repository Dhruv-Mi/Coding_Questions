package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Reshape_the_matrix {
    public static int[][] matrixReshape(int[][] mat,int r,int c){
        int row=mat.length;
        int col=mat[0].length;
        if(r*c!=row*col){
            return mat;
        }
        else{
            ArrayList<Integer> check=new ArrayList<>();
            int[][] output=new int[r][c];
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    check.add(mat[i][j]);
                }
            }
            int index=0;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    output[i][j]= check.get(index);
                    index++;
                }
            }
            return output;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] input=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                input[i][j]= sc.nextInt();
            }
        }
        int r= sc.nextInt();
        int c= sc.nextInt();
        int[][] output=matrixReshape(input,r,c);
        for(int i=0;i< output.length;i++){
            for(int j=0;j<output[0].length;j++){
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }
}
