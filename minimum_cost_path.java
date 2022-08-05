package com.company;

import java.util.Scanner;

public class minimum_cost_path {
    public static int minCostPath(int[][] cost){
        return minCostPathHelp(cost,0,0);
    }
    public static int minCostPathHelp(int[][] cost,int i,int j){
        int m=cost.length;
        int n=cost[0].length;
        if(i==m-1&&j==n-1){
            return cost[i][j];
        }
        if(i>m-1||j>n-1){
            return Integer.MAX_VALUE;
        }
        int opt1=minCostPathHelp(cost,i+1,j+1);
        int opt2=minCostPathHelp(cost,i+1,j);
        int opt3=minCostPathHelp(cost,i,j+1);
        return Math.min(opt1,Math.min(opt2,opt3)) + cost[i][j];
    }
    public static int minCostPathM(int[][] cost){
        int[][] storage=new int[cost.length][cost[0].length];
        for(int i=0;i<storage.length;i++){
            for (int j=0;j<storage[0].length;j++){
                storage[i][j]=-1;
            }
        }
        return minCostPathMHelp(cost,0,0,storage);
    }
    public static int minCostPathMHelp(int[][] cost,int i,int j,int[][] storage){
        int m=cost.length;
        int n=cost[0].length;
        if(i==m-1&&j==n-1){
            storage[i][j]=cost[i][j];
            return cost[i][j];
        }
        if(i>m-1||j>n-1){
            return Integer.MAX_VALUE;
        }
        if(storage[i][j]!=-1){
            return storage[i][j];
        }
        int opt1=minCostPathHelp(cost,i+1,j+1);
        int opt2=minCostPathHelp(cost,i+1,j);
        int opt3=minCostPathHelp(cost,i,j+1);
        storage[i][j]=Math.min(opt1,Math.min(opt2,opt3)) + cost[i][j];
        return storage[i][j];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[][] input=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                input[i][j]= sc.nextInt();
            }
        }
        int ans=minCostPath(input);
        int ans2=minCostPathM(input);
        System.out.println(ans2);
        System.out.println(ans);
    }
}
