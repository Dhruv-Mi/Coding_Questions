package com.company;

import java.util.Scanner;

public class Insertion_sort {
    public static void insertionSort(int[] arr){
        int key,j;
        for(int i=0;i< arr.length;i++){
            key=arr[i];
            j=i;
            while(j>0&&arr[j-1]>key){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=key;
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
            insertionSort(input);
            for(int j=0;j<n;j++){
                System.out.print(input[j]+" ");
            }
            System.out.println();
        }
    }
}
