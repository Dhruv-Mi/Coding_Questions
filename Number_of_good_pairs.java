package com.company;

import java.util.Scanner;

public class Number_of_good_pairs {
    public static int numIdenticalPairs(int[] nums){
        int length=nums.length;
        int ans=0;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(nums[i]==nums[j]){
                    ans++;
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
        int ans=numIdenticalPairs(nums);
        System.out.println(ans);
    }
}
