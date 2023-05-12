package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Can_make_arithmetic_progression_from_sequence {
    public static boolean canMakeArithmeticProgression(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        int d=arr[1]-arr[0];
        for(int i=2;i<n;i++){
            int temp=arr[i]-arr[i-1];
            if(temp!=d){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean ans=canMakeArithmeticProgression(arr);
        System.out.println(ans);
    }
}
