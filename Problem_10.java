package com.company;

import java.util.Scanner;

public class Problem_10 {
    public static String MoveHyphen(String str){
        StringBuilder ans= new StringBuilder();
        StringBuilder hyphen= new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='-'){
                hyphen.append('-');
            }
            else{
                ans.append(ch);
            }
        }
        return hyphen+ ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        String ans=MoveHyphen(str);
        System.out.println(ans);
    }
}
