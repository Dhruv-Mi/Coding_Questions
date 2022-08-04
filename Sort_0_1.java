package com.company;

import java.util.Scanner;

public class Sort_0_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        int i;
        for(i=0;i<t;i++){
            int[] input =arrayInput();
            sortZeroesAndOne(input);
        }
    }

    public static void sortZeroesAndOne(int[] arr) {
        int n= arr.length;
        int i,j;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if (arr[i]>arr[j]){
                    int k=arr[j];
                    arr[j]=arr[i];
                    arr[i]=k;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }

    public static int[] arrayInput(){
        Scanner sc=new Scanner(System.in);
        int i;
        int n= sc.nextInt();
        int[] input =new int[n];
        for(int j=0;j<n;j++){
            input[j]= sc.nextInt();
        }
        return input;
    }
}
