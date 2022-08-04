package com.company;

import java.util.Scanner;

public class Check_array_rotation {
    public static int arrayRotateCheck(int[] arr){
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            if(arr[i]>arr[i+1]){
                return i+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int[] input=new int[n];
            for(int j=0;j<n;j++){
                input[j] = sc.nextInt();
            }
            int check=arrayRotateCheck(input);
            System.out.println(check);
        }
    }
}
