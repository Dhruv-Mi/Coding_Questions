package com.company;

import java.util.Scanner;

public class Selection_sort {
    public static void selectionSort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            int min=arr[i];
            int index=i;
            for(int j=i+1;j< arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    index=j;
                }
            }
            int k=arr[i];
            arr[i]=min;
            arr[index]=k;
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
            selectionSort(input);
            for(int j=0;j<n;j++){
                System.out.print(input[j]+" ");
            }
            System.out.println();
        }
    }
}
