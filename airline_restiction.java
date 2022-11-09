package com.company;

import java.util.Scanner;

public class airline_restiction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            int[] input=new int[3];
            int largest=-1;
            int sum=0;
            for(int j=0;j<3;j++){
                input[j]= sc.nextInt();
                sum=sum+input[j];
            }
            int d= sc.nextInt();
            int e= sc.nextInt();
            for(int j=0;j<3;j++){
                if(largest<input[j]&&input[j]<=e){
                    largest=input[j];
                }
            }
            if(largest!=-1&&(sum-largest)<=d){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
