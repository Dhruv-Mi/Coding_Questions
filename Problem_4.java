package com.company;

import java.util.Scanner;

public class Problem_4 {
    public static int findCount(int[] arr,int num,int diff){
        int ans=0;
        for (int j : arr) {
            int temp = Math.abs(num - j);
            if (temp <= diff) {
                ans++;
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
        int num= sc.nextInt();
        int diff= sc.nextInt();
        int ans=findCount(arr,num,diff);
        System.out.println(ans);
    }
}
