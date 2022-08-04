package com.company;

import java.util.Scanner;

public class Minimum_number_of_Flips {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int[] input=new int[n];
            if(n%2==0){
                if(n==0){
                    System.out.println(-1);
                    continue;
                }
                int count1=0,count0=0;
                for(int j=0;j<n;j++){
                    input[j]= sc.nextInt();
                    if(input[j]==1){
                        count1++;
                    }
                    else{
                        count0++;
                    }
                }
                if(count0==0||count1==0){
                    System.out.println(n/2);
                }
                else if(count1>=count0){
                    System.out.println((n/2)-count0);
                }
                else {
                    System.out.println((n/2)-count1);
                }
            }
            else{
                for(int j=0;j<n;j++){
                    input[j]= sc.nextInt();
                }
                System.out.println(-1);
            }
        }
    }
}
