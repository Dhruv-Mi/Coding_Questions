package com.company;

import java.util.Scanner;

public class Merge_2_sorted_arrays {
    public static int[] merge(int[] arr1,int[] arr2){
        int len1= arr1.length;
        int len2= arr2.length;
        int[] output=new int[len1+len2];
        int i=0,j=0,k=0;
        while(i<len1&&j<len2){
            if(arr1[i]<=arr2[j]){
                output[k]=arr1[i];
                k++;
                i++;
            }
            else {
                output[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<len1){
            output[k]=arr1[i];
            i++;
            k++;
        }
        while(j<len2){
            output[k]=arr2[j];
            k++;
            j++;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n1=sc.nextInt();
            int[] input1=new int[n1];
            for(int j=0;j<n1;j++){
                input1[j]= sc.nextInt();
            }
            int n2= sc.nextInt();
            int[] input2=new int[n2];
            for(int j=0;j<n2;j++){
                input2[j]= sc.nextInt();
            }
            int[] ans=merge(input1,input2);
            for(int k=0;k<ans.length;k++){
                System.out.print(ans[k]+" ");
            }
            System.out.println();
        }
    }
}
