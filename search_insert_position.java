package com.company;

import java.util.Scanner;

public class search_insert_position {
    public static int searchInsert(int[] nums,int target){
        int len= nums.length;
        for(int i=0;i<len;i++){
            if(target<=nums[i]){
                return i;
            }
        }
        return len;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int target= sc.nextInt();
        int ans=searchInsert(input,target);
        System.out.println(ans);
    }
}
