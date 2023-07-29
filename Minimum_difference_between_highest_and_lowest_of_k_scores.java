package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_difference_between_highest_and_lowest_of_k_scores {
    public static int minimumDifference(int[] nums,int k){
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<=nums.length-k;i++){
            int temp=nums[i+k-1]-nums[i];
            ans=Math.min(ans,temp);
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
        int k= sc.nextInt();
        int ans=minimumDifference(nums,k);
        System.out.println(ans);
    }
}
