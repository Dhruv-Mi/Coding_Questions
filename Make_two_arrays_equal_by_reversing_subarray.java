package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Make_two_arrays_equal_by_reversing_subarray {
    public static boolean canBeEqual(int[] target,int[] arr){
        int n= target.length;
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]!=target[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] target=new int[n];
        for(int i=0;i<n;i++){
            target[i]= sc.nextInt();
        }
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        boolean ans=canBeEqual(target,arr);
        System.out.println(ans);
    }
}
