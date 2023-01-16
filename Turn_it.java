package com.company;

import java.util.Scanner;

public class Turn_it {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int a = sc.nextInt();
            int s = sc.nextInt();
            double temp = Math.sqrt((u*u)-2*a*s);
            if(temp>v){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}
