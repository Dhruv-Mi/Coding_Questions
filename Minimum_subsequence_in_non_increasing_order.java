package com.company;

import java.util.*;

public class Minimum_subsequence_in_non_increasing_order {
    public static List<Integer> minSubsequence(int[] nums){
        int n= nums.length;
        Arrays.sort(nums);
        int sum=0;
        for (int num : nums) {
            sum = sum + num;
        }
        List<Integer> ans=new ArrayList<>();
        int presentSum=0;
        for(int i=n-1;i>=0;i--){
            presentSum=presentSum+nums[i];
            ans.add(nums[i]);
            if(presentSum>sum-presentSum){
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        List<Integer> ans=minSubsequence(nums);
        for (Integer an : ans) {
            System.out.print(an + " ");
        }
    }
}
