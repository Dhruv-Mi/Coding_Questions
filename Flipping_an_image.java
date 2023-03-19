package com.company;

import java.util.Scanner;

public class Flipping_an_image {
    public static int[][] flipAndInvertImage(int[][] image){
        int[][] ans=new int[image.length][image.length];
        for(int i=0;i< image.length;i++){
            int k=0;
            for(int j= image.length-1;j>=0;j--){
                int temp=image[i][j];
                if(temp==1){
                    ans[i][k]=0;
                }
                else{
                    ans[i][k]=1;
                }
                k++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] image=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                image[i][j]= sc.nextInt();
            }
        }
        int[][] ans=flipAndInvertImage(image);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
