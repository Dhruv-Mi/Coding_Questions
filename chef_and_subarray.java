package com.company;

import java.util.Scanner;

public class chef_and_subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int[] input=new int[n];
            for(int j=0;j<n;j++){
                input[j]= sc.nextInt();
            }
            int count=0;
            for(int j=0;j<n;j++){
                for(int k=j;k<n;k++){
                    int sum=0;
                    int product=1;
                    for(int l=j;l<=k;l++) {
                        sum = sum + input[l];
                        product = product * input[l];
                    }
                    if(sum==product){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
