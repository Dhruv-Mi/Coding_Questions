package com.company;

import java.util.Scanner;

public class Maximum_difference_between_increasing_elements {
    public static int maximumDifference(int[] nums){
        int ans=-1;
        for(int i=0;i< nums.length-1;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[j]>nums[i]){
                    int temp=nums[j]-nums[i];
                    ans=Math.max(ans,temp);
                }
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
        int ans=maximumDifference(nums);
        System.out.println(ans);
    }
}
