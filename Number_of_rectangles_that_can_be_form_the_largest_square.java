package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Number_of_rectangles_that_can_be_form_the_largest_square {
    public static int countGoodRectangles(int[][] rectangles){
        int[] largest=new int[rectangles.length];
        for(int i=0;i<rectangles.length;i++){
            largest[i]=Math.min(rectangles[i][0],rectangles[i][1]);
        }
        Arrays.sort(largest);
        int ans=0;
        int max=largest[largest.length-1];
        for (int j : largest) {
            if (max == j) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] rectangles=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                rectangles[i][j]= sc.nextInt();
            }
        }
        int ans=countGoodRectangles(rectangles);
        System.out.println(ans);
    }
}
