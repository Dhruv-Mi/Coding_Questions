package com.company;

import java.util.Scanner;

public class Farenheit_to_celsius_table {
    public static void printFahrenheitTable(int start, int end, int step){
        float f=5/9f;
        for(int i=start;i<=end;i+=step){
            int celsius=(int)((i-32)*f);
            System.out.println(i+" "+celsius);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s= sc.nextInt();
        int e= sc.nextInt();
        int w= sc.nextInt();
        printFahrenheitTable(s,e,w);
    }
}
