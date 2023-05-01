package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lucky_number_in_a_matrix {
    public static List<Integer> luckyNumber(int[][] matrix){
        int m= matrix.length;
        int n=matrix[0].length;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<m;i++){
            int[] row=new int[n];
            System.arraycopy(matrix[i], 0, row, 0, n);
            Arrays.sort(row);
            int smallestInRow=row[0];
            int index=-1;
            for(int j=0;j<n;j++){
                if(matrix[i][j]==smallestInRow){
                    index=j;
                    break;
                }
            }
            int check=0;
            System.out.println("index : "+index+" Smallest : "+smallestInRow);
            for(int j=0;j<m;j++){
                if(smallestInRow<matrix[j][index]){
                    check=1;
                    break;
                }
            }
            if(check==0){
                ans.add(smallestInRow);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[][] matrix=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        List<Integer> ans=luckyNumber(matrix);
        for(int element : ans){
            System.out.print(element+" ");
        }
    }
}
