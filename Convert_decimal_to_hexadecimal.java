package com.company;

import java.util.Scanner;

public class Convert_decimal_to_hexadecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String ans=Integer.toHexString(n);
        System.out.println(ans);
    }
}
