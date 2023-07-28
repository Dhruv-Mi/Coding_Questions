package com.company;

import java.util.Scanner;

public class Delete_characters_to_make_fancy_string {
    public static String makeFancyString(String s){
        StringBuilder ans= new StringBuilder();
        char ch=s.charAt(0);
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=ch){
                ch=s.charAt(i);
                count=0;
            }
            if(count<2) {
                ans.append(s.charAt(i));
                count++;
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String ans=makeFancyString(s);
        System.out.println(ans);
    }
}
