package com.company;

import java.util.Scanner;

public class Maximum_subarray_sum {
    public static long maxSubarraySum(int[] nums,int n){
        long ans=0;
        long sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            ans=Math.max(ans,sum);
            sum=Math.max(sum,0);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        long ans=maxSubarraySum(nums,n);
        System.out.println(ans);
    }
}
