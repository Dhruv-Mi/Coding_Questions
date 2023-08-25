package com.company;

import java.util.Scanner;

public class Problem_5 {
    public static int differenceSum(int n,int m){
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=m;i++){
            if(i%n==0){
                sum1+=i;
            }
            else{
                sum2+=i;
            }
        }
        return Math.abs(sum2-sum1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int ans=differenceSum(n,m);
        System.out.println(ans);
    }
}
