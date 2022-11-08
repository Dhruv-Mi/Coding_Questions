package com.company;

import java.util.Scanner;

public class calculator {
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        char c=sc.next().charAt(0);
        if(c=='-'){
            System.out.println(a-b);
        }
        else if(c=='+'){
            System.out.println(a+b);
        }
        else if(c=='*'){
            System.out.println(a*b);
        }
        else{
            System.out.println(roundAvoid(a/b,6));
        }
    }
}
