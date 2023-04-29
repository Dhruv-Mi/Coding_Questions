package com.company;

import java.util.Scanner;

public class Check_if_n_and_its_double_exist {
    public static boolean checkIfExist(int[] arr){
        int length=arr.length;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(arr[i]==2*arr[j] || 2*arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean ans=checkIfExist(arr);
        System.out.println(ans);
    }
}
