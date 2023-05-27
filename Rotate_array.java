package com.company;

import java.util.Scanner;

public class Rotate_array {
    public static void rotate(int[] arr,int d){
        int[] first=new int[d];
        int[] second=new int[arr.length-d];
        for(int i=0;i< d;i++){
            first[i]=arr[i];
        }
        int j=0;
        for(int i=d;i< arr.length;i++){
            second[j]=arr[i];
            j++;
        }
        for(int i=0;i< second.length;i++){
            arr[i]=second[i];
        }
        j=0;
        for(int i= second.length;i<arr.length;i++){
            arr[i]=first[j];
            j++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int[] input=new int[n];
            for(int j=0;j<n;j++){
                input[j]= sc.nextInt();
            }
            int element= sc.nextInt();
            rotate(input,element);
            for(int k=0;k<n;k++){
                System.out.print(input[k]+" ");
            }
            System.out.println();
        }
    }
}
