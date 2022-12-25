package com.company;

import java.util.Scanner;

public class array_rotate {
    public static void rotate(int[] nums,int k){
        if(k == 0 || nums.length == 0 || nums==null){
            return;
        }
        int temp=nums[nums.length-1];
        int last= nums.length-1;
        int start=1;
        System.arraycopy(nums, 0, nums, start, last + 1 - start);
        nums[0]=temp;
        rotate(nums,--k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        rotate(input,k);
        for(int i=0;i<n;i++){
            System.out.print(input[i]+" ");
        }
    }
}
