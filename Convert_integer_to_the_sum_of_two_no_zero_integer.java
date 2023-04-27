package com.company;

import java.util.Scanner;

public class Convert_integer_to_the_sum_of_two_no_zero_integer {
    public static int[] getNoZeroInteger(int n){
        int[] ans=new int[2];
        ans[0]=1;
        ans[1]=n-1;
        while(Helper(ans[0]) || Helper(ans[1])){
            ans[0]++;
            ans[1]--;
        }
        return ans;
    }
    public static boolean Helper(int n){
        boolean ans=false;
        while(n!=0){
            int temp=n%10;
            if(temp==0){
                return true;
            }
            n=n/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] ans=getNoZeroInteger(n);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
