package com.company;

import java.util.Scanner;

public class Count_special_quadruplets {
    public static int countQuadruplets(int[] nums){
        int ans=0;
        for(int i=0;i< nums.length-3;i++){
            for(int j=i+1;j< nums.length-2;j++){
                for(int k=j+1;k< nums.length-1;k++){
                    for(int l=k+1;l< nums.length;l++){
                        if(nums[i]+nums[j]+nums[k]==nums[l]){
                            ans++;
                        }
                    }
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
        int ans=countQuadruplets(nums);
        System.out.println(ans);
    }
}
