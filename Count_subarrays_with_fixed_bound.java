package com.company;

import java.util.Scanner;

public class Count_subarrays_with_fixed_bound {
    public static long countSubarrays(int[] nums,int minK,int maxK){
        int length= nums.length;
        int count=0;
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                int min=findMin(nums,i,j);
                int max=findMax(nums,i,j);
                if(min==minK && max==maxK){
                    count++;
                }
            }
        }
        return count;
    }
    public static int findMin(int[] nums,int start,int end){
        int ans=Integer.MAX_VALUE;
        for(int i=start;i<=end;i++){
            if(ans>nums[i]){
                ans=nums[i];
            }
        }
        return ans;
    }
    public static int findMax(int[] nums,int start,int end){
        int ans=Integer.MIN_VALUE;
        for(int i=start;i<=end;i++){
            if(ans<nums[i]){
                ans=nums[i];
            }
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
        int minK= sc.nextInt();
        int maxK= sc.nextInt();
        long ans=countSubarrays(nums,minK,maxK);
        System.out.println(ans);
    }
}
