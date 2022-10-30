package com.company;

import java.util.Scanner;

public class adjacency_sum_parity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int[] input=new int[n];
            int count=0;
            for(int j=0;j<n;j++){
                input[j]= sc.nextInt();
                if(input[j]==1){
                    count++;
                }
            }
            if(count%2==0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
