package com.company;

import java.util.Scanner;

public class Monotonic_array {
    public static boolean isMonotonic(int[] num){
        int length= num.length;
        if(length!=1){
            int increasing_count=0;
            int decreasing_count=0;
            for(int i=1;i<length;i++){
                if(num[i]>num[i-1]){
                    increasing_count++;
                }
                if(num[i]<num[i-1]){
                    decreasing_count++;
                }
            }
            if(increasing_count>0 && decreasing_count>0){
                return false;
            }
            else{
                return true;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]= sc.nextInt();
        }
        boolean ans=isMonotonic(num);
        System.out.println(ans);
    }
}
