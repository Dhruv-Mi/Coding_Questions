package com.company;

import java.util.Scanner;

public class Find_the_middle_index_in_array {
    public static int findMiddleIndex(int[] nums){
        int n= nums.length;
        int sum=0;
        for (int num : nums) {
            sum += num;
        }
        for(int i=0;i<n;i++){
            int sum1=0;
            for(int j = 0; j< i; j++){
                sum1+=nums[j];
            }
            int sum2=sum-sum1-nums[i];
            if(sum1==sum2){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        int ans=findMiddleIndex(nums);
        System.out.println(ans);
    }
}
