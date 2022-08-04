package com.company;

import java.util.Scanner;

public class Rotate_array {
    public static void rotate(int[] arr,int d){
        int len= arr.length;
        int index=0;
        int check=0;
        for(int i=0;i<len;i++){
            if(arr[i]==d){
                index=i+1;
                check=1;
                break;
            }
        }
        if(index!=0&&check==1){
            int[] temp=new int[len];
            int k=0;
            for(int i=index;i<len;i++){
                temp[k]=arr[i];
                k++;
            }
            for(int j=0;j<index;j++){
                temp[k]=arr[j];
                k++;
            }
            for(int z=0;z<len;z++) {
                arr[z] = temp[z];
            }
        }
        else{
            return;
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
