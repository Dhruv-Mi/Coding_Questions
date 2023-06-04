package com.company;

import java.util.Scanner;

public class Find_the_highest_altitude {
    public static int largestAltitude(int[] gain){
        int ans=0;
        int sum=0;
        for (int j : gain) {
            sum = sum + j;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] gain=new int[n];
        for(int i=0;i<n;i++){
            gain[i]= sc.nextInt();
        }
        int ans=largestAltitude(gain);
        System.out.println(ans);
    }
}
