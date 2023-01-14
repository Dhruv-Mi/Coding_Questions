package com.company;

import java.util.Scanner;

public class Two_dishes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int temp=a+c;
            if(temp<=b){
                if(n<=temp){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                if(n<=b){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
