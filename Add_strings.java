package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Add_strings {
    public static String addStrings(String num1,String num2){
        BigInteger a=new BigInteger(num1);
        BigInteger b=new BigInteger(num2);
        return ""+a.add(b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= sc.next();
        String s2=sc.next();
        String ans=addStrings(s1,s2);
        System.out.println(ans);
    }
}
