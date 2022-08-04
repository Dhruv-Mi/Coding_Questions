package com.company;

import java.util.Scanner;

public class zeros_and_star_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i,j;
        int start=1;
        int col=(2*n)+1;
        int end=col;
        for(i=1;i<=n;i++){
            for(j=1;j<=col;j++){
                if(j==(col/2)+1){
                    System.out.print("*");
                }
                else if(j==start){
                    System.out.print("*");
                }
                else if(j==end){
                    System.out.print("*");
                }
                else {
                    System.out.print("0");
                }
            }
            start++;
            end--;
            System.out.println();
        }
    }
}