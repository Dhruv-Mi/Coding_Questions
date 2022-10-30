package com.company;

import java.util.Scanner;

public class how_much_scholarship {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n>=1&&n<=50){
            System.out.println("100");
        }
        else if(n>=51&&n<=100){
            System.out.println("50");
        }
        else{
            System.out.println("0");
        }
    }
}
