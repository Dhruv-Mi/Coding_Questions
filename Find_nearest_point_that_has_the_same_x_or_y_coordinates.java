package com.company;

import java.util.Scanner;

public class Find_nearest_point_that_has_the_same_x_or_y_coordinates {
    public static int nearestValidPoints(int x,int y,int[][] points){
        int n=points.length;
        int ans=-1;
        int sum=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int pointX=points[i][0];
            int pointY=points[i][1];
            if(pointX==x || pointY==y){
                int dist=Math.abs(pointX-x)+Math.abs(pointY-y);
                if(dist<sum){
                    ans=i;
                    sum=dist;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        int n= sc.nextInt();
        int[][] points=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                points[i][j]= sc.nextInt();
            }
        }
        int ans=nearestValidPoints(x,y,points);
        System.out.println(ans);
    }
}
