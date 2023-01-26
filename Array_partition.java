package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array_partition {
    public static int arrayPairSum(int[] nums){
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2)
            ans += nums[i];
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        int ans=arrayPairSum(nums);
        System.out.println(ans);
    }
}
