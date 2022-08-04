package com.company;

import java.util.Scanner;

public class find_unique {
    public static int findUnique(int[] arr){
        int size= arr.length;
        int i,j;
        for(i=0;i<size;i++){
            int k=0;
            for(j=0;j<size;j++){
                if(i==j){
                    continue;
                }
                else if(arr[i]==arr[j]){
                    k=1;
                    break;
                }
            }
            if(k==0){
                return arr[i];
            }
        }
        return 0;
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
            int unique=findUnique(input);
            System.out.println(unique);
        }
    }
}