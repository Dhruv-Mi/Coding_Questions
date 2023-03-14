package com.company;

import java.util.Scanner;

public class Largest_triangle_area {
        public static double largestTriangleArea(int[][] points) {
            double ans = 0;
            int n = points.length;

            for(int i =0; i<n; i++)
                for(int j =i+1; j<n; j++)
                    for(int k =j+1; k<n; k++)
                        ans = Math.max(ans , Math.abs(area(points[i], points[j], points[k])));
            return ans;
        }
        public static double area(int[] x1, int[] x2, int[] x3)
        {
            int t1 = x1[0] * ( x2[1] - x3[1]);
            int t2 = x2[0] * ( x3[1] - x1[1]);
            int t3 = x3[0] * ( x1[1] - x2[1]);
            return (double)( t1 + t2 + t3 )/2;
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
        double ans=largestTriangleArea(points);
        System.out.println(ans);
    }
}
