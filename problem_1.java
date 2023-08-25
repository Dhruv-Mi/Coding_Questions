package com.company;

import java.util.Scanner;

public class problem_1 {
    public static int solve(int r,int unit,int n,int[] arr){
        int total=r*unit;
        int sum=0;
        int count=0;
        if(n==0){
            return -1;
        }
        for(int i=0;i<n;i++){
            sum+=arr[i];
            count++;
            if(sum>=total){
                return count;
            }
        }
        if(sum<total){
            return 0;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        int unit= sc.nextInt();
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int ans=solve(r,unit,n,arr);
        System.out.println(ans);
    }
}
