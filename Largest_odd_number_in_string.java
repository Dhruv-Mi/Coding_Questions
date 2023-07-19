package com.company;

import java.util.Scanner;

public class Largest_odd_number_in_string {
    public static String largestOddNumber(String num){
        for(int i=num.length()-1;i>=0;i--){
            char ch=num.charAt(i);
            int n=Integer.parseInt(""+ch);
            if(n%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num= sc.next();
        String ans=largestOddNumber(num);
        System.out.println(ans);
    }
}
