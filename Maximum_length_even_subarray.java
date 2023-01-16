package com.company;

import java.util.Scanner;

public class Maximum_length_even_subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int sum=0;
            int j=1;
            int ans=0;
            while(j<=n){
                sum=sum+j;
                if(sum%2==0){
                    ans=j;
                }
                j++;
            }
            System.out.println(ans);
        }
    }
}
