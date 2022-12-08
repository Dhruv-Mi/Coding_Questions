package com.company;

import java.util.Scanner;

public class Hungry_chef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int x= sc.nextInt();
            int y= sc.nextInt();
            int n= sc.nextInt();
            int r= sc.nextInt();
            int count=0;
            while(count<=n){
                int temp=x*count+(y*(n-count));
                if(temp>r){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count>n){
                System.out.println("-1");
            }
            else {
                System.out.println(count + " " + (n - count));
            }
        }
    }
}
