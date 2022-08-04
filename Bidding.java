package com.company;

import java.util.Scanner;

public class Bidding {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int ans=Math.max(a,Math.max(b,c));
            if(ans==a){
                System.out.println("Alice");
            }
            else if(ans==b){
                System.out.println("Bob");
            }
            else{
                System.out.println("Charlie");
            }
        }
    }
}
