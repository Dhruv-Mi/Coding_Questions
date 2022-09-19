package com.company;

import java.util.Scanner;

class NumArray{
    private int[] input;

    public NumArray(int[] nums){
        input=nums;
    }

    public int sumRange(int left,int right){
        int sum=0;
        for(int i=left;i<=right;i++){
            sum=sum+input[i];
        }
        return sum;
    }
}

public class num_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        NumArray obj=new NumArray(input);
        int ans1=obj.sumRange(0,2);
        int ans2=obj.sumRange(2,5);
        int ans3=obj.sumRange(0,5);
        System.out.println(ans1+" "+ans2+" "+ans3);
    }
}
