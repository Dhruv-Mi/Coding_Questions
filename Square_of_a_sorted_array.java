package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Square_of_a_sorted_array {
    public static int[] sortedSquare(int[] nums){
        int length= nums.length;
        for(int i=0;i<length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int[] ans=sortedSquare(input);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
