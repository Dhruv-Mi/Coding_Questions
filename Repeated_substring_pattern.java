package com.company;

import java.util.Scanner;

public class Repeated_substring_pattern {
    public static boolean repeatedSubstringPattern(String s){
        String s1=s+s;
        String s2=s1.substring(1,s1.length()-1);
        return s2.contains(s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        boolean ans=repeatedSubstringPattern(s);
        System.out.println(ans);
    }
}
