package com.company;

import java.util.Scanner;

public class richie_rich {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int x= sc.nextInt();
            int ans=(b-a)/x;
            System.out.println(ans);
        }
    }
}
