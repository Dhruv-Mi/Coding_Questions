package com.company;

import java.util.Scanner;

public class knapsack_0_1 {
    public static int knapsack(int[] weights,int[] values,int n,int w){
        return knapsackHelp(weights,values,n,w,0);
    }
    public static int knapsackHelp(int[] weights,int[] values,int n,int w,int index){
        if(index>n-1){
            return 0;
        }
        if(weights[index]>w){
            return knapsackHelp(weights,values,n,w,index+1);
        }
        int opt1=values[index]+knapsackHelp(weights,values,n,w-weights[index],index+1);
        int opt2=knapsackHelp(weights,values,n,w,index+1);
        return Math.max(opt1,opt2);
    }
    public static int knapsackM(int[] weights,int[] values,int n,int w){
        int[] storage=new int[n];
        for(int i=0;i<n;i++){
            storage[i]=-1;
        }
        return knapsackMHelp(weights,values,n,w,0,storage);
    }
    public static int knapsackMHelp(int[] weights,int[] values,int n,int w,int index,int[] storage){
        if(index>n-1){
            return 0;
        }
        if(weights[index]>w){
            storage[index]=knapsackMHelp(weights,values,n,w,index+1,storage);
            return knapsackHelp(weights,values,n,w,index+1);
        }
        if(storage[index]!=-1){
            return storage[index];
        }
        int opt1=values[index]+knapsackHelp(weights,values,n,w-weights[index],index+1);
        int opt2=knapsackHelp(weights,values,n,w,index+1);
        storage[index]=Math.max(opt1,opt2);
        return storage[index];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] weights=new int[n];
        for(int i=0;i<n;i++){
            weights[i]= sc.nextInt();
        }
        int[] values=new int[n];
        for(int i=0;i<n;i++){
            values[i]=sc.nextInt();
        }
        int w= sc.nextInt();
        int ans2=knapsackM(weights,values,n,w);
        int ans=knapsack(weights,values,n,w);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
