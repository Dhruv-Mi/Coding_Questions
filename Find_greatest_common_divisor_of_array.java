package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Find_greatest_common_divisor_of_array {
    public static int findGCD(int[] nums){
        int n=nums.length;
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[n-1];
        int ans=1;
        for(int i=2;i<=min;i++){
            if(min%i==0 && max%i==0 && i>ans){
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
        int ans=findGCD(nums);
        System.out.println(ans);
    }
}
