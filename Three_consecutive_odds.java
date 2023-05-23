package com.company;

import java.util.Scanner;

public class Three_consecutive_odds {
    public static boolean threeConsecutiveOdds(int[] arr){
        int count=0;
        for (int j : arr) {
            if(count>=3){
                return true;
            }
            if (j % 2 == 1) {
                count++;
            } else {
                count = 0;
            }
        }
        return count>=3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        boolean ans=threeConsecutiveOdds(arr);
        System.out.println(ans);
    }
}
