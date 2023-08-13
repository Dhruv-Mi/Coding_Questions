package com.company;

import java.util.Scanner;

public class Kth_element_of_two_sorted_arrays {
    public static long kthElement(int[] arr1,int[] arr2,int k){
        int i=0;
        int j=0;
        int[] temp=new int[arr1.length+ arr2.length];
        int z=0;
        while(i<arr1.length && j< arr2.length){
            if(arr1[i]<arr2[j]){
                temp[z]=arr1[i];
                i++;
            }
            else{
                temp[z]=arr2[j];
                j++;
            }
            z++;
        }
        while(i< arr1.length){
            temp[z]=arr1[i];
            i++;
            z++;
        }
        while(j<arr2.length){
            temp[z]=arr2[j];
            j++;
            z++;
        }
        return temp[k-1];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n= sc.nextInt();
        int[] arr1=new int[m];
        for(int i=0;i<m;i++){
            arr1[i]= sc.nextInt();
        }
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        long ans=kthElement(arr1,arr2,k);
        System.out.println(ans);
    }
}
