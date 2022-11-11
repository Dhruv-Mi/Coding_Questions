package com.company;

import java.util.Scanner;

public class Mask_policy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            int total= sc.nextInt();
            int infected= sc.nextInt();
            int uninfected=total-infected;
            System.out.println(Math.min(infected, uninfected));
        }
    }
}
