package com.company;

import java.util.Scanner;

public class Sort_0_1_2{
    public static void sort012(int[] arr){
        int len= arr.length;
        int val0=0,val1=0,val2=0;
        for (int k : arr) {
            if (k == 0) {
                val0++;
            } else if (k == 1) {
                val1++;
            } else {
                val2++;
            }
        }
        for(int j=0;j<val0;j++){
            arr[j]=0;
        }
        for(int j=val0;j<len-val2;j++){
            arr[j]=1;
        }
        for(int j=len-val2;j<len;j++){
            arr[j]=2;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int[] input=new int[n];
            for(int j=0;j<n;j++){
                input[j]= sc.nextInt();
            }
            sort012(input);
            for(int j=0;j<n;j++){
                System.out.print(input[j]+" ");
            }
            System.out.println();
        }
    }
}
