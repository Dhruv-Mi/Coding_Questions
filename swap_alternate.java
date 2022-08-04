package com.company;

import java.util.Scanner;

public class swap_alternate {
    public static void swapAlternate(int[] arr){
        int size= arr.length;
        int i;
        if(size%2==0){
            for(i=0;i<size;i+=2){
                int k=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=k;
            }
        }
        else{
            int n=size-1;
            for(i=0;i<n;i+=2){
                int k=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=k;
            }
        }
    }

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
            swapAlternate(input);
            for(int j=0;j<n;j++){
                System.out.print(input[j]+" ");
            }
            System.out.println();
        }
    }
}
