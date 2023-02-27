package com.company;

import java.util.Scanner;

public class Longest_continuous_increasing_subsequence {
    public static int findLengthOfLCIS(int[] nums){
        int length= nums.length;
        int ans=Integer.MIN_VALUE;
        int count=1;
        for(int i=1;i<length;i++){
            if(nums[i]>nums[i-1]){
                count++;
            }
            else{
                if(count>ans){
                    ans=count;
                }
                count=1;
            }
        }
        return Math.max(ans,count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int ans=findLengthOfLCIS(input);
        System.out.println(ans);
    }
}
