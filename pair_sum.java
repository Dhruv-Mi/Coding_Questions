package com.company;

import java.util.Scanner;

public class pair_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        int i;
        for(i=0;i<t;i++){
            int n= sc.nextInt();
            int[] input=new int[n];
            for(int j=0;j<n;j++){
                input[j]= sc.nextInt();
            }
            int x= sc.nextInt();
            int total=pairSum(input,x);
            System.out.println(total);
        }
    }

    private static int pairSum(int[] arr, int x) {
        int n= arr.length;
        int i,j,count=0;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    count++;
                }
            }
        }
        return count;
    }
}
