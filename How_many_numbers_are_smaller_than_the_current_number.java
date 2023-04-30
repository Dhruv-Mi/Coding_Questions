package com.company;

import java.util.Scanner;

public class How_many_numbers_are_smaller_than_the_current_number {
    public static int[] smallerNumbersThanCurrent(int[] nums){
        int n= nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]>nums[j] && i!=j){
                    count++;
                }
            }
            ans[i]=count;
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
        int[] ans=smallerNumbersThanCurrent(nums);
        for(int i : ans){
            System.out.print(i+" ");
        }
    }
}
