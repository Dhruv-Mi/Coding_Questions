package com.company;

import java.util.Scanner;

public class Array_intersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        int i;
        for(i=0;i<t;i++){
            int n= sc.nextInt();
            int[] arr1=new int[n];
            for(int j=0;j<n;j++){
                arr1[j]= sc.nextInt();
            }
            int m= sc.nextInt();
            int[] arr2=new int[m];
            for(int j=0;j<m;j++){
                arr2[j]= sc.nextInt();
            }
            intersections(arr1,arr2);
        }
    }

    private static void intersections(int[] arr1, int[] arr2) {
        int size1= arr1.length;
        int size2= arr2.length;
        int i,j;
        for(i=0;i<size1;i++){
            for(j=0;j<size2;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j]=0;
                    break;
                }
            }
        }
    }
}
