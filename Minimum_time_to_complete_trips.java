package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_time_to_complete_trips {
    public static long minimumTime(int[] time,int totalTrips){
        Arrays.sort(time);
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<=10000000;i++){
            int count=0;
            for (int k : time) {
                count = count + i / k;
            }
            if(count>=totalTrips){
                return i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] time=new int[n];
        for(int i=0;i<n;i++){
            time[i]= sc.nextInt();
        }
        int totalTrips= sc.nextInt();
        long ans=minimumTime(time,totalTrips);
        System.out.println(ans);
    }
}
