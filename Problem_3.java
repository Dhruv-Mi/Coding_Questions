package com.company;

import java.util.Scanner;

public class Problem_3 {
    public static int checkPassword(String str){
        if(str.length()<4 || str.charAt(0)>='0' && str.charAt(0)<='9'){
            return 0;
        }
        int numeric=0;
        int capital=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='0' && ch<='9'){
                numeric++;
            }
            else if(ch>='A' && ch<='Z'){
                capital++;
            }
            else if(ch=='/' || ch==' '){
                return 0;
            }
        }
        if(numeric==0 || capital==0){
            return 0;
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        int ans=checkPassword(str);
        System.out.println(ans);
    }
}
