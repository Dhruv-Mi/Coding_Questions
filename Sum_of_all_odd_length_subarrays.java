package com.company;

import java.util.Scanner;

public class Sum_of_all_odd_length_subarrays {
    public static int sumOddLengthSubarrays(int[] arr){
        int ans=0;
        for(int i=1;i<=arr.length;i+=2){
            for(int j=0;j<=arr.length-i;j++){
                int count=0;
                for(int k=j;k<j+i;k++){
                    count=count+arr[k];
                }
                ans=ans+count;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=sumOddLengthSubarrays(arr);
        System.out.println(ans);
    }
}
