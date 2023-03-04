package com.company;

import java.util.Scanner;

public class Cut_the_sheet {
    public static int isPossible(int w,int h,long n){
        if(n==1){
            return 1;
        }
        int count=0;
        if(w%2==0){
            int i=2;
            while(w%2==0){
                count=i;
                i=i*2;
                w=w/2;
            }
        }
        if(h%2==0){
            int i=2;
            while(h%2==0){
                count=i;
                h=h/2;
                i=i*2;
            }
        }
        if(count>=n){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w= sc.nextInt();
        int h= sc.nextInt();
        long n= sc.nextInt();
        int ans=isPossible(w,h,n);
        System.out.println(ans);
    }
}
