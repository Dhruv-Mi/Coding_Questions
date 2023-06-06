package com.company;

import java.util.Scanner;

public class Minimum_changes_to_make_alternating_binary_string {
    public static int minOperations(String s){
        StringBuilder str1= new StringBuilder();
        StringBuilder str2= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                str1.append('0');
                str2.append('1');
            }
            else{
                str1.append('1');
                str2.append('0');
            }
        }
        int ans1=0;
        int ans2=0;
        for(int i=0;i<s.length();i++){
            char str1Ch=str1.charAt(i);
            char str2Ch=str2.charAt(i);
            char sCh=s.charAt(i);
            if(str1Ch!=sCh){
                ans1++;
            }
            if(str2Ch!=sCh){
                ans2++;
            }
        }
        return Math.min(ans1,ans2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int ans=minOperations(s);
        System.out.println(ans);
    }
}
