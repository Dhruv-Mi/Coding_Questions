package com.company;

import java.util.Scanner;

public class Rearrange_an_array_in_maximum_minimum_form_using_two_pointer_technique {
    public static void rearrange(long[] arr){
        long[] ans=new long[arr.length];
        int left=0;
        int right=arr.length-1;
        int i=0;
        while(left<right){
            ans[i]=arr[right];
            ans[i+1]=arr[left];
            i+=2;
            left++;
            right--;
        }
        if(left==right) {
            ans[i] = arr[left];
        }
        for(i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        rearrange(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
