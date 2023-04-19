package com.company;

import java.util.Scanner;

public class Check_if_it_is_a_straight_line {
    public static boolean checkStraightLine(int[][] coordinates){
        int diffX=coordinates[1][0]-coordinates[0][0];
        int diffY=coordinates[1][1]-coordinates[0][1];
        int x1=coordinates[0][0];
        int y1=coordinates[0][1];
        for (int[] coordinate : coordinates) {
            int x = coordinate[0];
            int y = coordinate[1];
            int check1 = (x - x1)*diffY;
            int check2 = (y - y1)*diffX ;
            if (check1 != check2) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] coordinates=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                coordinates[i][j]= sc.nextInt();
            }
        }
        boolean ans=checkStraightLine(coordinates);
        System.out.println(ans);
    }
}
