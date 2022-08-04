package com.company;

import java.util.Scanner;

public class loot_houses {
    public static int maxMoneyLooted(int[] houses){
        return maxMoneyLootedHelp(houses,0);
    }
    public static int maxMoneyLootedHelp(int[] houses,int i){
        if(i>houses.length-1){
            return 0;
        }
        int opt1=houses[i]+maxMoneyLootedHelp(houses,i+2);
        int opt2=maxMoneyLootedHelp(houses,i+1);
        return Math.max(opt1,opt2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int ans=maxMoneyLooted(input);
        System.out.println(ans);
    }
}
