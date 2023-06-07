package com.company;

import java.util.Scanner;

public class Maximum_ascending_subarray_sum {
    public static int maxAscendingSum(int[] nums){
        int n= nums.length;
        int ans=Integer.MIN_VALUE;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<n-1;i++){
            int sum=nums[i];
            for(int j=i+1;j<n;j++){
                if(nums[j]>nums[j-1]){
                    sum+=nums[j];
                }
                else{
                    i=j-1;
                    break;
                }
                ans=Math.max(ans,sum);
            }
            ans=Math.max(ans,sum);
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
        int ans=maxAscendingSum(nums);
        System.out.println(ans);
    }
}
