package com.company;

import java.util.Collections;
import java.util.Scanner;

public class Largest_number_at_least_twice_of_others {
    public static int dominantIndex(int[] nums){
        int max=Integer.MIN_VALUE;
        int index = 0;
        for(int i=0;i< nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }
        }
        for(int i=0;i< nums.length;i++){
            if(i!=index){
                if((nums[i]*2)>max){
                    return -1;
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        int ans=dominantIndex(nums);
        System.out.println(ans);
    }
}
