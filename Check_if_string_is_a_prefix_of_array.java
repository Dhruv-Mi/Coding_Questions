package com.company;

import java.util.Scanner;

public class Check_if_string_is_a_prefix_of_array {
    public static boolean isPrefixString(String s,String[] words){
        StringBuilder ans= new StringBuilder();
        int length=s.length();
        for (String temp : words) {
            ans.append(temp);
            if (ans.toString().equals(s)) {
                return true;
            }
            if (ans.length() > length) {
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int n= sc.nextInt();
        String[] words=new String[n];
        for(int i=0;i<n;i++){
            words[i]= sc.next();
        }
        boolean ans=isPrefixString(s,words);
        System.out.println(ans);
    }
}
