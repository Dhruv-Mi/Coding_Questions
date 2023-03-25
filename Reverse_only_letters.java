package com.company;

import java.util.Scanner;

public class Reverse_only_letters {
    public static String reverseOnlyLetters(String s){
        StringBuilder letters= new StringBuilder();
        int length=s.length();
        StringBuilder ans= new StringBuilder();
        for(int i=length-1;i>=0;i--){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                letters.append(ch);
            }
        }
        int k=0;
        for(int i=0;i<length;i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                ans.append(letters.charAt(k));
                k++;
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans=reverseOnlyLetters(s);
        System.out.println(ans);
    }
}
