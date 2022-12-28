package com.company;

import java.util.Scanner;

public class Find_number {
    public static boolean findNumber(int[][] nums,int n){
        int row= nums.length;
        int col=nums[0].length;
        int i=0;
        int j=col-1;
        while(i<row && j>=0){
            if(nums[i][j]==n){
                return true;
            }
            else if(nums[i][j]>n){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
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
        int k= sc.nextInt();
        boolean ans=findNumber(input,k);
        System.out.println(ans);
    }
}
