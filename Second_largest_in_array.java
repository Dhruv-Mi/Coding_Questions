package com.company;

import java.util.Scanner;

public class Second_largest_in_array {
    public static int secondLargestElement(int[] arr){
        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(max<=arr[i]){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(second_max<=arr[i]&&second_max<max&&arr[i]!=max){
                second_max=arr[i];
            }
        }
        return second_max;
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
            int element=secondLargestElement(input);
            System.out.println(element);
        }
    }
}
