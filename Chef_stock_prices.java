package com.company;

import java.util.Scanner;

public class Chef_stock_prices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            double s= sc.nextDouble();
            double a= sc.nextDouble();
            double b= sc.nextDouble();
            double c= sc.nextDouble();
            double revised_price;
            if(c<0){
                revised_price = s - (((Math.abs(c) / 100) * s));
            }
            else{
                revised_price = s + ((Math.abs(c) / 100) * s);
            }
            if(revised_price>=a&&revised_price<=b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
