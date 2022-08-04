package com.company;

import java.util.Scanner;

public class sum_of_array {
    public static int sum(int[] input){
        int sum=input[0];
        int[] temp=new int[input.length-1];
        for(int j=0;j< input.length-1;j++){
            temp[j]=input[j+1];
        }
        if(input.length>1){
            int i=sum(temp);
            sum=sum+i;
            return sum;
        }
        else{
            return input[0];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        int i;
        for(i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int ans=sum(arr);
        System.out.println(ans);
    }
}
