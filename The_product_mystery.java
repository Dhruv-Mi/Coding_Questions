package com.company;

import java.util.Scanner;

public class The_product_mystery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            int b= sc.nextInt();
            int c= sc.nextInt();
            boolean check=true;
            int ans=0;
            int value=1;
            while (check){
                if((value*b)%c==0){
                    ans=value;
                    check=false;
                }
                value++;
            }
            System.out.println(ans);
        }
    }
}
