package com.company;

import java.util.Scanner;

public class Running_Sum_of_1d_Array {
    public static int[] runningSum(int[] input){
        int[] output=new int[input.length];
        output[0]=input[0];
        for(int i=1;i< input.length;i++){
            output[i]=output[i-1]+input[i];
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int[] output=runningSum(input);
        for(int j=0;j< output.length;j++){
            System.out.print(output[j]+" ");
        }
    }
}
