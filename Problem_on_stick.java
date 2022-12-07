package com.company;

import java.util.Scanner;

public class Problem_on_stick {
    public static boolean CheckEquality(int[] arr){
        boolean check=true;
        for (int i=0;i< arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                check=false;
                break;
            }
        }
        return check;
    }
    public static int SumElement(int[] input){
        int sum=0;
        for (int j : input) {
            sum = sum + j;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            int n= sc.nextInt();
            int[] input=new int[n];
            int operations=0;
            for (int j=0;j<n;j++){
                input[j]= sc.nextInt();
            }
            while (!CheckEquality(input)){
                operations++;
                int average=SumElement(input)/n;
                for (int j=0;j<n;j++){
                    if(input[j]>average){
                        input[j]=input[j]-average;
                    }
                }
            }
            System.out.println(operations+1);
        }
    }
}
