package com.company;

import java.util.Scanner;

public class Sort_an_array_of_0s_1s_and_2s {
    public static void sort012(int[] a){
        int count0=0;
        int count1=0;
        int count2=0;
        for (int k : a) {
            if (k == 0) {
                count0++;
            } else if (k == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        int i=0;
        for(int j=0;j<count0;j++){
            a[i]=0;
            i++;
        }
        for(int j=0;j<count1;j++){
            a[i]=1;
            i++;
        }
        for(int j=0;j<count2;j++){
            a[i]=2;
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        sort012(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
