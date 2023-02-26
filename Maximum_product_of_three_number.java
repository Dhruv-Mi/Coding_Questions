package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_product_of_three_number {
    public static int maximumProduct(int[] nums){
        Arrays.sort(nums);
        int temp1= nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int temp2=Integer.MIN_VALUE;
        if(nums[0]<0 && nums[1]<0){
            temp2=nums[0]*nums[1]*nums[nums.length-1];
        }
        return Math.max(temp1,temp2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int ans=maximumProduct(input);
        System.out.println(ans);
    }
}
