package com.company;

import java.util.Scanner;

public class Minimum_operation_to_make_the_array_increasing {
    public static int minOperations(int[] nums){
        int n=nums.length;
        int ans=0;
        for(int i=1;i<n;i++){
            if(nums[i]<=nums[i-1]){
                int temp=nums[i-1]-nums[i];
                int increase=temp+1;
                nums[i]=nums[i]+increase;
                ans=ans+increase;
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
        int ans=minOperations(nums);
        System.out.println(ans);
    }
}
