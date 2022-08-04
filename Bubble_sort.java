package com.company;

import java.util.Scanner;

public class Bubble_sort {
    public static void bubbleSort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
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
            bubbleSort(input);
            for(int j=0;j<n;j++){
                System.out.print(input[j]+" ");
            }
            System.out.println();
        }
    }
}
