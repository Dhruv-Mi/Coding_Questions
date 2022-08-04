package com.company;

import java.util.Scanner;

public class Arrange_number_in_array {
    public static void arrange(int[] arr,int n){
        int i;
        if(n%2!=0){
            int l=n-1;
            for(i=0;i<n;i++){
                if(i==n/2){
                    arr[i]=n;
                }
                else if(i<n/2){
                    arr[i]=2*i+1;
                }
                else{
                    arr[i]=l;
                    l=l-2;
                }
            }
        }
        else{
            int l=n-2;
            for(i=0;i<n;i++){
                if(i==n/2){
                    arr[i]=n;
                }
                else if(i<n/2){
                    arr[i]=2*i+1;
                }
                else{
                    arr[i]=l;
                    l=l-2;
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
            arrange(input,n);
            for(int j=0;j<n;j++){
                System.out.print(input[j]+" ");
            }
            System.out.println();
        }
    }
}