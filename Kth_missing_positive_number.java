package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Kth_missing_positive_number {
    public static int findKthPositive(int[] arr,int k){
        ArrayList<Integer> list=new ArrayList<>();
        for (int j : arr) {
            list.add(j);
        }
        int i=1;
        while(k>0){
            if(!list.contains(i)){
                k--;
            }
            i++;
        }
        return i-1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        int ans=findKthPositive(arr,k);
        System.out.println(ans);
    }
}
