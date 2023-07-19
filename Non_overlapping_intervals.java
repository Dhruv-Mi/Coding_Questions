package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Non_overlapping_intervals {
    public static int eraseOverlapIntervals(int[][] intervals){
        int n = intervals.length;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        int prev = 0;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] >= intervals[prev][1]) {
                prev = i;
                count++;
            }
        }
        return n - count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] intervals=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                intervals[i][j]= sc.nextInt();
            }
        }
        int ans=eraseOverlapIntervals(intervals);
        System.out.println(ans);
    }
}
