package com.company;

import java.util.Scanner;

public class Binary_search {
    public static int binarySearch(int[] arr,int x){
        int len= arr.length;
        int last=len-1;
        int first=0;
        int mid=(first+last)/2;
        while(first<=last){
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int ans;
            int value= sc.nextInt();
            ans=binarySearch(arr,value);
            System.out.println(ans);
        }
    }
}
