package com.company;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            int n= sc.nextInt();
            int[] goal=new int[n];
            int[] foul=new int[n];
            int max_point=0;
            for(int j=0;j<n;j++){
                goal[j]= sc.nextInt();
            }
            for(int j=0;j<n;j++){
                foul[j]= sc.nextInt();
            }
            for(int j=0;j<n;j++){
                int total=(goal[j]*20)-(foul[j]*10);
                if(total>0&&total>max_point){
                    max_point=total;
                }
            }
            System.out.println(max_point);
        }
    }
}
