package com.company;

import java.util.Scanner;

public class Minimum_distance_to_the_target_element {
    public static int getMinDistance(int[] nums,int target,int start){
        int ans=Integer.MAX_VALUE;
        for(int i=0;i< nums.length;i++){
            if(nums[i]==target){
                int temp=Math.abs(start-i);
                ans=Math.min(ans,temp);
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
        int target= sc.nextInt();
        int start= sc.nextInt();
        int ans=getMinDistance(nums,target,start);
        System.out.println(ans);
    }
}
