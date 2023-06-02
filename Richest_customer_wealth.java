package com.company;

import java.util.Scanner;

public class Richest_customer_wealth {
    public static int maximumWealth(int[][] accounts){
        int ans=0;
        int n=accounts[0].length;
        for (int[] account : accounts) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += account[j];
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[][] accounts=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                accounts[i][j]=sc.nextInt();
            }
        }
        int ans=maximumWealth(accounts);
        System.out.println(ans);
    }
}
