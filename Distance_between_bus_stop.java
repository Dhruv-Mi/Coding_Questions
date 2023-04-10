package com.company;

import java.util.Scanner;

public class Distance_between_bus_stop {
    public static int distanceBetweenBusStop(int[] distance,int start,int destination){
        int sum=0;
        for (int j : distance) {
            sum = sum + j;
        }
        int ans1=0;
        if(start<destination) {
            for (int i = start; i < destination; i++) {
                ans1 = ans1 + distance[i];
            }
        }
        else{
            for (int i = destination; i < start; i++) {
                ans1 = ans1 + distance[i];
            }
        }
        return Math.min(ans1, sum - ans1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] distance=new int[n];
        for(int i=0;i<n;i++){
            distance[i]= sc.nextInt();
        }
        int start= sc.nextInt();
        int destination=sc.nextInt();
        int ans=distanceBetweenBusStop(distance,start,destination);
        System.out.println(ans);
    }
}
