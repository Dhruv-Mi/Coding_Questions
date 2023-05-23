package com.company;

import java.util.Scanner;

public class Count_good_triplets {
    public static int countGoodTriplets(int[] arr,int a,int b,int c){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    int first=arr[i];
                    int second=arr[j];
                    int third=arr[k];
                    if(Math.abs(first-second)<=a && Math.abs(second-third)<=b && Math.abs(first-third)<=c){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int ans=countGoodTriplets(arr,a,b,c);
        System.out.println(ans);
    }
}
