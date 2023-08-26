package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_8 {
    public static int pair(int sum,int[] arr){
        if(arr.length<2){
            return -1;
        }
        Arrays.sort(arr);
        if(arr[0]+arr[1]>sum){
            return 0;
        }
        else{
            return arr[0]*arr[1];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum= sc.nextInt();
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int ans=pair(sum,arr);
        System.out.println(ans);
    }
}
