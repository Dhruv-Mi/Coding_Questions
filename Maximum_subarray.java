package com.company;

import java.util.Scanner;

public class Maximum_subarray {
    public static int maxSubArray(int[] nums){
        int length= nums.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                int sum=0;
                for (int k=i;k<=j;k++){
                    sum=sum+nums[k];
                }
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for (int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int ans=maxSubArray(input);
        System.out.println(ans);
    }
}
