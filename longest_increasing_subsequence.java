package com.company;

import java.util.Scanner;

public class longest_increasing_subsequence {
    public static int lis(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            int tempCount=0;
            for(int j=i+1;j< arr.length;j++){
                if(temp<arr[j]){
                    tempCount++;
                }
            }
            if(count<tempCount){
                count=tempCount;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int ans=lis(input);
        System.out.println(ans);
    }
}
