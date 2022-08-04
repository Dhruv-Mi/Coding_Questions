package com.company;

import java.util.Scanner;

public class Leaders_in_array {
    public static void leaders(int[] arr){
        int len=arr.length;
        int i,j;
        int[] output=new int[len];
        int index=0;
        for(i=0;i<len-1;i++){
            int n=0;
            for(j=i+1;j<len;j++){
                if(arr[i]<arr[j]){
                    n=1;
                    break;
                }
            }
            if(n==0){
                output[index]=arr[i];
                index++;
            }
        }
        output[index]=arr[len-1];
        for(i=0;i<=index;i++){
            System.out.print(output[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        int i;
        for(i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        leaders(input);
    }
}
