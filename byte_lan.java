package com.company;

import java.util.Scanner;

public class byte_lan {
    public static int byteLandian(int n){
        if(n==0 || n==1){
            return n;
        }
        int opt1=byteLandian(n/2);
        int opt2=byteLandian(n/3);
        int opt3=byteLandian(n/4);
        int temp=opt1+opt2+opt3;
        return Math.max(temp, n);
    }

    public static int byteLandianM(int n){
        int[] storage=new int[n+1];
        for(int i=0;i<=n;i++){
            storage[i]=-1;
        }
        return byteLandianMHelp(n,storage);
    }

    public static int byteLandianMHelp(int n,int[] storage){
        if(n==0 || n==1){
            storage[n]=n;
            return storage[n];
        }
        if(storage[n]!=-1){
            return storage[n];
        }
        int opt1=byteLandian(n/2);
        int opt2=byteLandian(n/3);
        int opt3=byteLandian(n/4);
        int temp=opt1+opt2+opt3;
        storage[n]=Math.max(temp,n);
        return storage[n];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=byteLandian(n);
        int ans2=byteLandianM(n);
        System.out.println(ans2);
        System.out.println(ans);
    }
}
