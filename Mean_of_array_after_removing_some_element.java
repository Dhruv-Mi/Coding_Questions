package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Mean_of_array_after_removing_some_element {
    public static double trimMean(int[] arr){
        double n =( 0.05 * arr.length );
        Arrays.sort(arr);
        double sum = 0;
        for(int i = (int)n; i<arr.length-n ; i++)
            sum = sum + arr[i];
        double len  = arr.length - 2*n;
        sum  = sum / len;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        double ans=trimMean(arr);
        System.out.println( ans);
    }
}
