package com.company;

import java.util.Scanner;

public class Number_of_zero_filled_subarray {
    public static long zeroFilledSubarray(int[] nums){
        long count=0;
        long ans=0;
        for (int num : nums) {
            if (num == 0) {
                count++;
            } else {
                ans = ans + ((count * (count + 1)) / 2);
                count = 0;
            }
        }
        if(count!=0){
            ans=ans+((count *(count+1))/2);
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
        long ans=zeroFilledSubarray(nums);
        System.out.println(ans);
    }
}
