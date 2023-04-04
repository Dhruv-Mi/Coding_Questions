package com.company;

import java.util.Scanner;

public class Valid_boomerang {
    public static boolean isBoomerang(int[][] p){
        return (p[0][0] - p[1][0]) * (p[0][1] - p[2][1]) != (p[0][0] - p[2][0]) * (p[0][1] - p[1][1]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] points=new int[3][2];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                points[i][j]= sc.nextInt();
            }
        }
        boolean ans=isBoomerang(points);
        System.out.println(ans);
    }
}
