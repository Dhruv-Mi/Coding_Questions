package com.company;

import java.util.Scanner;

public class Max_consecutive_ones {
    public static int findMaxConsecutiveOnes(int[] nums){
        int max=Integer.MIN_VALUE;
        int count=0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max,count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int ans=findMaxConsecutiveOnes(input);
        System.out.println(ans);
    }
}
