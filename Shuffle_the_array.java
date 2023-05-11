package com.company;

import java.util.Scanner;

public class Shuffle_the_array {
    public static int[] shuffle(int[] nums,int n){
        int length= nums.length;
        int[] ans=new int[length];
        int j=0;
        for(int i=n;i<length;i++){
            ans[j]=nums[i-n];
            ans[j+1]=nums[i];
            j+=2;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int[] nums=new int[m];
        for(int i=0;i<m;i++){
            nums[i]= sc.nextInt();
        }
        int n= sc.nextInt();
        int[] ans=shuffle(nums,n);
        for(int elem : ans){
            System.out.print(elem+" ");
        }
    }
}
