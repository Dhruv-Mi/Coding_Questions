package com.company;

import java.util.Scanner;

public class Akaash_and_equal_mean {
    public static int counts(int[] input,double mean){
        int count=0,i,j;
        for(i=0;i< input.length-1;i++){
            for(j=i+1;j< input.length;j++){
                double sum;
                sum=input[i]+input[j];
                double mean1=sum/2;
                if(mean1==mean){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        int k;
        for(k=0;k<t;k++){
            int n= sc.nextInt();
            int[] arr=new int[n];
            int i;
            for(i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            double sum=0;
            for(i=0;i<n;i++){
                sum+=arr[i];
            }
            double mean=sum/n;
            int count=counts(arr,mean);
            System.out.println(count);
        }
    }
}