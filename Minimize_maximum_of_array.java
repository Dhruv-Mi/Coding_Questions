package com.company;

import java.util.Scanner;

public class Minimize_maximum_of_array {
    public static int minimizeArrayValue(int[] nums){
        int ans=Integer.MAX_VALUE;
        int index=findIndex(nums);
        if(index==0){
            return nums[index];
        }
        else{
            index=findIndex(nums);
            while(ans>=nums[index]){
                if(index==0){
                    return nums[index];
                }
                ans=nums[index];
                nums[index]=nums[index]-1;
                nums[index-1]=nums[index-1]+1;
                index=findIndex(nums);
            }
            return ans;
        }
    }
    public static int findIndex(int[] nums){
        int ans=-1;
        int temp=Integer.MIN_VALUE;
        for(int i=0;i< nums.length;i++){
            if(temp<nums[i]){
                temp=nums[i];
                ans=i;
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
        int ans=minimizeArrayValue(nums);
        System.out.println(ans);
    }
}
