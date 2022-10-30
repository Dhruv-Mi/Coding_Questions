package com.company;

import java.util.Scanner;

public class packaging_cupcakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            if(n<=2){
                System.out.println(n);
            }
            else{
                int ans=(n/2)+1;
                System.out.println(ans);
            }
        }
    }
}
