package com.company;

import java.util.Scanner;

public class Determine_if_string_halves_are_alike {
    public static boolean halvesAreAlike(String s){
        int length=s.length();
        int index=length/2;
        String a=s.substring(0,index);
        String b=s.substring(index);
        String vowel="aeiouAEIOU";
        int countA=0;
        int countB=0;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(vowel.contains(ch+"")){
                countA++;
            }
        }
        for(int i=0;i<b.length();i++){
            char ch=b.charAt(i);
            if(vowel.contains(ch+"")){
                countB++;
            }
        }
        return countA==countB;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        boolean ans=halvesAreAlike(s);
        System.out.println(ans);
    }
}
