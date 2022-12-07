package com.company;

import java.util.Scanner;

public class Average_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int k= sc.nextInt();
            int v= sc.nextInt();
            int[] input=new int[n];
            int sum=0;
            for(int j=0;j<n;j++){
                input[j]= sc.nextInt();
                sum=sum+input[j];
            }
            int temp=v*(n+k)-sum;
            if(temp>0&&temp%k==0){
                System.out.println(temp/k);
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
