package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Smallest_range_1 {
    public static int smallestRange(int[] nums,int k){
        int length= nums.length;
        if(length==1){
            return 0;
        }
        else {
            Arrays.sort(nums);
            int diff1 = nums[length-1]-nums[0];
            nums[0]=nums[0]+k;
            nums[length-1]=nums[length-1]-k;
            int diff2=nums[length-1]-nums[0];
            int ans= Math.min(diff1,diff2);
            return Math.max(ans, 0);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for (int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        int ans= smallestRange(nums,k);
        System.out.println(ans);
    }
}
