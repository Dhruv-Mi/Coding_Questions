package com.company;

import java.util.Scanner;

public class Is_the_score_consistent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int d= sc.nextInt();
            if(c>=a&&d>=b&&(a>=0||b>=0||c>=0||d>=0)){
                System.out.println("POSSIBLE");
            }
            else{
                System.out.println("IMPOSSIBLE");
            }
        }
    }
}
