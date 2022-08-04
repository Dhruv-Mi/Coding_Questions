package com.company;

import java.util.Scanner;

public class Square_root {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n= sc.nextByte();
        long square=(long)(Math.sqrt(n));
        System.out.println(square);
    }
}
