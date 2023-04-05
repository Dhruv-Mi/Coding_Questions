package com.company;

import java.util.Scanner;

public class Duplicate_zeros {
    public static void duplicateZeros(int[] arr){
        int length=arr.length;
        int[] temp=new int[length];
        int j=0;
        for(int i=0;i<length;i++){
            if(arr[j]==0 && i!=length-1){
                temp[i]=arr[j];
                temp[i+1]=0;
                i++;
            }
            else if(arr[j]==0 && i==length-1){
                temp[i]=arr[j];
                i++;
            }
            else{
                temp[i]=arr[j];
            }
            j++;
        }
        System.arraycopy(temp, 0, arr, 0, length);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        duplicateZeros(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
