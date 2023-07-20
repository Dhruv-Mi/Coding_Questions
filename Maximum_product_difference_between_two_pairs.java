package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_product_difference_between_two_pairs {
    public static int maxProductDifference(int[] nums){
        Arrays.sort(nums);
        return (nums[nums.length-1]*nums[nums.length-2])-(nums[1]*nums[0]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for (int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        int ans=maxProductDifference(nums);
        System.out.println(ans);
    }
}
