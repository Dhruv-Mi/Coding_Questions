package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Maximize_sum_of_array_after_k_negation {
    public static int largestSumAfterKNegation(int[] nums,int k){
        Arrays.sort(nums);
        while(k>0){
            nums[0]=nums[0]*-1;
            Arrays.sort(nums);
            k--;
        }
        int sum=0;
        for (int num : nums) {
            sum = sum + num;
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
        int k= sc.nextInt();
        int ans=largestSumAfterKNegation(nums,k);
        System.out.println(ans);
    }
}
