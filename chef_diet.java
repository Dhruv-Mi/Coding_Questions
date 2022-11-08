package com.company;

import java.util.Scanner;

public class chef_diet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int k= sc.nextInt();
            int count=0;
            int sum=0;
            int[] perDay=new int[n];
            for(int j=0;j<n;j++){
                perDay[j]= sc.nextInt();
                sum=perDay[j]+sum;
                count++;
                if(sum<k){
                    System.out.println("NO "+count);
                    sum=sum-k;
                    break;
                }
                else{
                    sum=sum-k;
                }
            }
            if(sum>=0){
                System.out.println("YES");
            }
        }
    }
}
