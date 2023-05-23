package com.company;

import java.util.Scanner;

public class Thousand_separator {
    public static String thousandSeparator(int n){
        String temp=""+n;
        int count=0;
        StringBuilder ans= new StringBuilder();
        for(int i=temp.length()-1;i>=0;i--){
            count++;
            char ch=temp.charAt(i);
            if(count%3==0){
                ans.insert(0, "." + ch);
            }
            else{
                ans.insert(0, ch);
            }
        }
        if(ans.charAt(0)=='.'){
            return ans.substring(1);
        }
        else{
            return ans.toString();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String ans=thousandSeparator(n);
        System.out.println(ans);
    }
}
