package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Convert_array_into_zig_zag_fashion {
    public static void zigZag(int[] arr){
        Arrays.sort(arr);
        for(int i=1;i<arr.length-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        zigZag(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
