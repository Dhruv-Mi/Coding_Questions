package com.company;

import java.util.Scanner;

public class Teemo_attacking {
    public static int findPoisonedDuration(int[] timeSeries,int duration){
        int count=0;
        int index=0;
        for(int i=0;i<timeSeries.length;i++){
            if(index<=timeSeries[i]){
                count=count+(duration);
                index=timeSeries[i]+duration;
            }
            else{
                count=count+(duration)-(index-timeSeries[i]);
                index=timeSeries[i]+duration;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] timeSeries=new int[n];
        for(int i=0;i<n;i++){
            timeSeries[i]= sc.nextInt();
        }
        int duration= sc.nextInt();
        int ans=findPoisonedDuration(timeSeries,duration);
        System.out.println(ans);
    }
}
