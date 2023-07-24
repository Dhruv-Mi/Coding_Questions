package com.company;

import java.util.Scanner;

public class Concatenation_of_array {
    public static int[] getConcatenation(int[] nums){
        int n= nums.length;
        int[] ans=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
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
        int[] ans=getConcatenation(nums);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
