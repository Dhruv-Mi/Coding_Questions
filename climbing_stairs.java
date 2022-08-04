package com.company;

import java.util.Scanner;

public class climbing_stairs {
    public static int climbStairs(int n){
        int f1=0;
        int f2=1;
        if(n==1){
            return 1;
        }
        else{
            int ans=n;
            for(int i=0;i<n;i++){
                ans=f1+f2;
                int temp=f2;
                f2=ans;
                f1=temp;
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=climbStairs(n);
        System.out.println(ans);
    }
}
