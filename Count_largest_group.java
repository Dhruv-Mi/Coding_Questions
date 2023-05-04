package com.company;

import java.util.Scanner;

public class Count_largest_group {
    public static int countLargestGroup(int n){
        int[] result=new int[9];
        for(int i=1;i<=n;i++){
            int temp=countSum(i);
            result[temp-1]=result[temp-1]+1;
        }
        int ans=1;
        int check=result[0];
        for(int i=1;i< result.length;i++){
            if(result[i]==check){
                ans++;
            }
            else if(result[i]>check){
                check=result[i];
                ans=1;
            }
        }
        return ans;
    }
    public static int countSum(int n){
        while(n%10!=n){
            int temp=0;
            while(n!=0){
                temp=temp+n%10;
                n=n/10;
            }
            n=temp;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=countLargestGroup(n);
        System.out.println(ans);
    }
}
