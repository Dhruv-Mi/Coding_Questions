package com.company;

import java.util.Scanner;

public class Check_if_all_1s_are_at_least_length_k_places_away {
    public static boolean kLengthApart(int[] nums,int k){
        int count1=0;
        int dist=0;
        for (int value : nums) {
            if (count1 == 0 && value == 1) {
                count1++;
                dist = 0;
            } else if (count1 == 1 && value == 1) {
                if (dist < k) {
                    return false;
                }
                dist = 0;
            } else {
                dist++;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        boolean ans=kLengthApart(nums,k);
        System.out.println(ans);
    }
}
