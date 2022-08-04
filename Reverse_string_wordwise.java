package com.company;

import java.util.Scanner;

public class Reverse_string_wordwise {
    public static String reverseWordWise(String str){
        int end=str.length();
        int i=str.length()-1;
        String ans="";
        while(i>=0){
            if(str.charAt(i)==' '){
                ans=ans+str.substring(i+1,end)+" ";
                end=i;
            }
            i--;
        }
        ans+=str.substring(i+1,end);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        String result=reverseWordWise(str);
        System.out.println(result);
    }
}
