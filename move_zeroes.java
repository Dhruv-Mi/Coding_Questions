package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class move_zeroes {
    public static int[] moveZeroes(int[] nums){
        int len= nums.length;
        int i=0,j=0;
        while(j<len){
            if(nums[j]!=0){
                nums[i++]=nums[j];
            }
            j++;
        }
        while(i<len){
            nums[i]=0;
            i++;
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int[] ans=moveZeroes(input);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
