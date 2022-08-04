package com.company;

import java.util.Scanner;

public class String_Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.next();
        String b= sc.next();
        int tempA=0;
        int tempB=0;
        for(int i=0;i<a.length();i++){
            tempA=(tempA*10)+a.charAt(i)-48;
        }
        for(int i=0;i<b.length();i++){
            tempB=(tempB*10)+b.charAt(i)-48;
        }
        String ans=""+tempA*tempB;
        System.out.println(ans);
        System.out.println(ans.getClass());
    }
}
