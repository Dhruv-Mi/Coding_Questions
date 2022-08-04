package com.company;

import java.util.Scanner;

public class Push_zeros_to_end {
    public static void pushZerosAtEnd(int[] arr){
        int len= arr.length;
//        APPROACH-1
//        for(int i=0;i<len-1;i++){
//            for(int j=0;j<len-i-1;j++){
//                if(arr[j]<arr[j+1]&&arr[j]==0){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//      APPROACH-2
        int count = 0;
        for (int i = 0; i < len; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];
        while (count < arr.length) {
            arr[count++] = 0;
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
            pushZerosAtEnd(input);
            for(int j=0;j<n;j++){
                System.out.print(input[j]+" ");
            }
            System.out.println();
        }
    }
}
