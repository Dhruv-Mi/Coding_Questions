package com.company;

import java.util.Scanner;

public class Covid_and_theatre_tickets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            int row= sc.nextInt();
            int column= sc.nextInt();
            int count=Math.ceilDiv(row,2)*Math.ceilDiv(column,2);
            System.out.println(count);
        }
    }
}
