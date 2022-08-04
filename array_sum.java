package com.company;

import java.util.Scanner;

public class array_sum {
    public static int[] input(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        return input;
    }

    public static int sum(int[] arr){
        int i,sum=0;
        int size= arr.length;
        for(i=0;i<size;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        int i;
        for(i=1;i<=t;i++){
            int[] input=input();
            int sum=sum(input);
            System.out.println(sum);
        }
    }
}
