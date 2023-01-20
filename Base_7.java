package com.company;

import java.util.Scanner;

public class Base_7 {
    public static String convertToBase7(int num){
        if (num == 0) {
            return "0";
        }
        String res = "";
        boolean isNegative = num < 0;
        long abs = Math.abs(num);
        while (abs > 0) {
            long rem = abs % 7;
            res = rem + res;
            abs /= 7;
        }
        if (isNegative) {
            res = "-" + res;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String ans=convertToBase7(n);
        System.out.println(ans);
    }
}
