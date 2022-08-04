package com.company;

import java.util.Scanner;

public class Sum_of_two_arrays {
    public static void sumOfTwoArrays(int[] arr1,int[] arr2,int[] output){
        int len1= arr1.length;
        int len2= arr2.length;
        int len3= output.length;
        int sum1=0,sum2=0;
        for(int i=0;i<len1;i++){
            sum1=sum1*10+arr1[i];
        }
        for(int i=0;i<len2;i++){
            sum2=sum2*10+arr2[i];
        }
        int sum=sum1+sum2;
        for(int j=len3-1;j>=0;j--){
            int val=sum%10;
            output[j]=val;
            sum=sum/10;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int[] input1=new int[n];
            for(int j=0;j<n;j++){
                input1[j]=sc.nextInt();
            }
            int m= sc.nextInt();
            int[] input2=new int[m];
            for(int k=0;k<m;k++){
                input2[k]= sc.nextInt();
            }
            if(n>=m) {
                int[] output=new int[n+1];
                sumOfTwoArrays(input1,input2,output);
                for(int z=0;z< output.length;z++){
                    System.out.print(output[z]+" ");
                }
                System.out.println();
            }
            else{
                int[] output=new int[m+1];
                sumOfTwoArrays(input1,input2,output);
                for(int z=0;z< output.length;z++){
                    System.out.print(output[z]+" ");
                }
                System.out.println();
            }
        }
    }
}
