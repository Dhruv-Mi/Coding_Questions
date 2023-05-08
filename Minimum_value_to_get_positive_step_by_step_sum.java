package com.company;

import java.util.Scanner;

public class Minimum_value_to_get_positive_step_by_step_sum {
    public static int minStartValue(int[] nums){
        int sum=0;
        int minimum=Integer.MAX_VALUE;
        for (int num : nums) {
            sum = sum + num;
            minimum = Math.min(minimum, sum);
        }
        if(minimum>0){
            return 1;
        }
        else{
            return Math.abs(minimum)+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        int ans=minStartValue(nums);
        System.out.println(ans);
    }
}
