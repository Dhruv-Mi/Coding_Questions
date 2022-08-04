package com.company;

import java.util.Scanner;

public class DNA_Storage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            String ans="";
            int n= sc.nextInt();
            int[] input=new int[n];
            for(int j=0;j<n;j++){
                input[j]=sc.nextInt();
            }
            for(int k=0;k<n;k=k+2){
                if(input[k]==0 && input[k+1]==0){
                        ans=ans+'A';
                    }
                else if(input[k]==0 && input[k+1]==1){
                        ans=ans+'T';
                }
                else if(input[k]==1 && input[k+1]==0){
                        ans=ans+'C';
                }
                else if(input[k]==1 && input[k+1]==1){
                        ans=ans+'G';
                }
            }
            System.out.println(ans);
        }
    }
}
