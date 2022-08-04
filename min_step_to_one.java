package com.company;

import java.util.Scanner;

public class min_step_to_one {
    public static int countMinStepsToOne(int n){
        if(n<=1){
            return 0;
        }
        int opt1=Integer.MAX_VALUE,opt2=Integer.MAX_VALUE;
        int opt3=countMinStepsToOne(n-1);
        if(n%2==0){
            opt1=countMinStepsToOne(n/2);
        }
        if(n%3==0){
            opt2=countMinStepsToOne(n/3);
        }
        return Math.min(opt1,Math.min(opt2,opt3))+1;
    }

    public static int countMinStepsOneM(int n){
        int[] storage=new int[n+1];
        for(int i=0;i<=n;i++){
            storage[i]=-1;
        }
        return countMinStepsOneMHelp(n,storage);
    }

    public static int countMinStepsOneMHelp(int n,int[] storage){
        if(n<=1){
            storage[n]=0;
            return storage[n];
        }
        if(storage[n]!=-1){
            return storage[n];
        }
        int opt1=Integer.MAX_VALUE,opt2=Integer.MAX_VALUE;
        int opt3=countMinStepsToOne(n-1);
        if(n%2==0){
            opt1=countMinStepsToOne(n/2);
        }
        if(n%3==0){
            opt2=countMinStepsToOne(n/3);
        }
        storage[n]=Math.min(opt1,Math.min(opt2,opt3))+1;
        return storage[n];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=countMinStepsToOne(n);
        int ans2=countMinStepsOneM(n);
        System.out.println(ans2);
        System.out.println(ans);
    }
}
