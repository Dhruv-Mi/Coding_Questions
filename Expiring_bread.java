package com.company;

import java.util.Scanner;

public class Expiring_bread {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int m= sc.nextInt();
            int k= sc.nextInt();
            if(m*k>=n){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
