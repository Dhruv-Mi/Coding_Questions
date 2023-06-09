package com.company;

import java.util.Scanner;

public class Sum_of_digits_in_base_k {
    public static int sumBase(int n,int k){
        int temp=Integer.parseInt(Integer.toString(n,k));
        int ans=0;
        while(temp!=0){
            ans=ans+(temp%10);
            temp=temp/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int ans=sumBase(n,k);
        System.out.println(ans);
    }
}
