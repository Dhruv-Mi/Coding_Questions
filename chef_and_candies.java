package com.company;

import java.util.Scanner;

public class chef_and_candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int x= sc.nextInt();
            int n= sc.nextInt();
            if(x<=n){
                System.out.println("0");
            }
            else{
                int diff=x-n;
                int packets;
                if(diff%4==0){
                    packets=diff/4;
                    System.out.println(packets);
                }
                else{
                    packets=(diff/4)+1;
                    System.out.println(packets);
                }
            }
        }
    }
}
