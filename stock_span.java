package com.company;

import java.util.Scanner;

public class stock_span {
    public static int[] stockSpan(int[] input){
        int[] output=new int[input.length];
        output[0]=1;
        for(int i=1;i<input.length;i++){
            int count=1;
            int temp=input[i];
            for(int j=i-1;j>=0;j--){
                if(input[j]<temp){
                    count++;
                }
                else{
                    break;
                }
            }
            output[i]=count;
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]=sc.nextInt();
        }
        int[] output=stockSpan(input);
        for (int j : output) {
            System.out.print(j + " ");
        }
    }
}
