package com.company;

import java.util.Scanner;

public class Three_boxes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int d= sc.nextInt();
            int min=Math.min(a,Math.min(b,c));
            int total=a+b+c;
            if(total<=d){
                System.out.println("1");
            }
            else if(min==a){
                if(min+b<=d||min+c<=d){
                    System.out.println("2");
                }
                else {
                    System.out.println("3");
                }
            }
            else if(min==b){
                if(min+a<=d||min+c<=d){
                    System.out.println("2");
                }
                else {
                    System.out.println("3");
                }
            }
            else{
                if(min+b<=d||min+a<=d){
                    System.out.println("2");
                }
                else {
                    System.out.println("3");
                }
            }
        }
    }
}
