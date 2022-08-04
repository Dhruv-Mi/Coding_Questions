package com.company;

import java.util.Scanner;

public class longest_common_prefix {
    public static String longestCommonPrefix(String[] strs){
        int len= strs.length;
        if(len==0){
            return "";
        }
        String first="";
        int min=Integer.MAX_VALUE;
        for(String str : strs){
            if(str.length()<min){
                first=str;
                min=str.length();
            }
        }
        String ans="";
        for(int i=0;i<first.length();i++){
            char ch=first.charAt(i);
            int check=0;
            for (String str : strs) {
                if (ch != str.charAt(i)) {
                    check = 1;
                    break;
                }
            }
            if(check==0){
                ans=ans+ch;
            }
            else{
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String[] input=new String[n];
        for(int i=0;i<n;i++){
            input[i]= sc.next();
        }
        String ans=longestCommonPrefix(input);
        System.out.println(ans);
    }
}
