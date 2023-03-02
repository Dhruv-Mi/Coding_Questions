package com.company;

import java.util.Scanner;

public class Find_pivot_index {
    public static int pivotIndex(int[] nums){
        int length=nums.length;
        for(int i=0;i<length;i++){
            int left_sum=pivotIndexHelper(nums,0,i);
            int right_sum=pivotIndexHelper(nums,i+1,length);
            if(left_sum==right_sum){
                return i;
            }
        }
        return -1;
    }

    public static int pivotIndexHelper(int[] nums,int start,int end){
        int sum=0;
        for(int i=start;i<end;i++){
            sum=sum+nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        int ans=pivotIndex(nums);
        System.out.println(ans);
    }
}
