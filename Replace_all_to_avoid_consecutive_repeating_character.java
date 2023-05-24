package com.company;

import java.util.Scanner;

public class Replace_all_to_avoid_consecutive_repeating_character {
    public static String modifyString(String s){
        if(s.length()==1 && s.charAt(0)=='?'){
            return "a";
        }
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='?'){
                if(i==0){
                    char forward=s.charAt(i+1);
                    if(forward!='a'){
                        ans.append('a');
                    }
                    else{
                        ans.append('b');
                    }
                }
                else if(i==s.length()-1){
                    char backward=s.charAt(i-1);
                    if(backward!='a'){
                        ans.append('a');
                    }
                    else{
                        ans.append('b');
                    }
                }
                else{
                    char forward=s.charAt(i+1);
                    char backward=s.charAt(i-1);
                    if(forward!='a' && backward!='a'){
                        ans.append('a');
                    }
                    else if(forward!='b' && backward!='b'){
                        ans.append('b');
                    }
                    else {
                        ans.append('c');
                    }
                }
                s=ans+s.substring(i+1);
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
        String ans=modifyString(s);
        System.out.println(ans);
    }
}
