package com.company;

import java.util.Scanner;

public class Staircase {
    public static int staircase(int n){
        if(n>=0&&n<=1){
            return 1;
        }
        if(n<0){
            return 0;
        }
        int opt1=staircase(n-1);
        int opt2=staircase(n-2);
        int opt3=staircase(n-3);
        return opt1+opt2+opt3;
    }

    public static int staircaseM(int n){
        int[] storage=new int[n+1];
        for(int i=0;i<n+1;i++){
            storage[i]=-1;
        }
        return staircaseMHelp(n,storage);
    }

    public static int staircaseMHelp(int n,int[] storage){
        if(n>=0&&n<=1){
            storage[n]=1;
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(storage[n]!=-1){
            return storage[n];
        }
        int opt1=staircase(n-1);
        int opt2=staircase(n-2);
        int opt3=staircase(n-3);
        storage[n]=opt1+opt2+opt3;
        return storage[n];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=staircase(n);
        int ans2=staircaseM(n);
        System.out.println(ans2);
        System.out.println(ans);
    }
}
