package com.company;

import java.util.Scanner;

public class Minimum_time_visiting_all_points {
    public static int minTimeToVisitAllPoints(int[][] points){
        int length=points.length;
        int ans=0;
        for(int i=1;i<length;i++){
            int diffX=Math.abs(points[i][0]-points[i-1][0]);
            int diffY=Math.abs(points[i][1]-points[i-1][1]);
            ans=ans+Math.max(diffX,diffY);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] points=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                points[i][j]= sc.nextInt();
            }
        }
        int ans=minTimeToVisitAllPoints(points);
        System.out.println(ans);
    }
}
