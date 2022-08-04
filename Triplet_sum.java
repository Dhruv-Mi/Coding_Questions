package com.company;

import java.util.Scanner;

public class Triplet_sum {
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
            int x= sc.nextInt();
            int total=findTriplet(input,x);
            System.out.println(total);
        }
    }

    public static int findTriplet(int[] arr,int x){
        int n= arr.length;
        int i,j,count=0,k;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                for(k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
