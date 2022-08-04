package com.company;

import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int i=1;
        while(i<=10){
            int p=num*i;
            System.out.println(p);
            i++;
        }
    }
}
