package com.company;

import java.util.Locale;
import java.util.Scanner;

public class valid_palindrome {
    public static boolean isPalindrome(String s){
        s=s.toLowerCase();
        String temp="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='A'&&s.charAt(i)<='Z') || (s.charAt(i)>='a'&&s.charAt(i)<='z') || (s.charAt(i)>='0'&&s.charAt(i)<='9')){
                temp=temp+s.charAt(i);
            }
        }
        System.out.println("Temp: "+temp);
        String tempReverse="";
        for(int i=temp.length()-1;i>=0;i--){
            tempReverse=tempReverse+temp.charAt(i);
        }
        System.out.println("TempReverse: "+tempReverse);
        return temp.equals(tempReverse);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.nextLine();
        boolean ans=isPalindrome(input);
        System.out.println(ans);
    }
}
