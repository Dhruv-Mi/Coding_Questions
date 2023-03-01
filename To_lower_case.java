package com.company;

import java.util.Scanner;

public class To_lower_case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String ans=s.toLowerCase();
        System.out.println(ans);
    }
}
