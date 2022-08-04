package com.company;

import java.util.Scanner;

public class Two_sum {
    public static int[] twoSum(int[] input,int target){
        int[] ans=new int[2];
        for(int i=0;i< input.length-1;i++){
            for(int j=i+1;j< input.length;j++){
                if(input[i]+input[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int target= sc.nextInt();
        int[] ans=twoSum(input,target);
        for(int j : ans){
            System.out.print(j+" ");
        }
    }
}
