package com.company;

import java.util.Scanner;

public class reduce_array {
    public static int reduceArray(int[] a){
        int count=0;
        for (int j : a) {
            int temp = j;
            while (temp != 0) {
                temp = temp / 2;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int[] input=new int[n];
            for(int j=0;j<n;j++){
                input[j]= sc.nextInt();
            }
            int ans=reduceArray(input);
            System.out.println(ans);
        }
    }
}
