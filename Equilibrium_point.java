package com.company;

import java.util.Scanner;

public class Equilibrium_point {
    public static int equilibriumPoint(long[] arr){
        long sum=0;
        for (long l : arr) {
            sum += l;
        }
        long left=0;
        long right=sum;
        for(int i=0;i<arr.length;i++){
            right=right-arr[i];
            if(left==right){
                return i+1;
            }
            left=left+arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextLong();
        }
        int ans=equilibriumPoint(arr);
        System.out.println(ans);
    }
}
