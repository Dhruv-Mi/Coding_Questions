package com.company;

import java.util.Scanner;

public class Longest_nice_substring {
    public static String longestNiceSubstring(String s){
        char[] values={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int length=s.length();
        String ans="";
        for(int i=0;i<length-1;i++){
            String temp="";
            for(int j=i;j<length;j++){
                char ch=s.charAt(j);
                boolean check=true;
                temp=temp+ch;
                for(int k=0;k<26;k++){
                    char lower=values[k];
                    char upper=Character.toUpperCase(lower);
                    if(temp.contains(lower+"") && !temp.contains(upper+"")){
                        check=false;
                        break;
                    }
                    if(!temp.contains(lower+"") && temp.contains(upper+"")){
                        check=false;
                        break;
                    }
                }
                if(check && temp.length()>ans.length()){
                    ans=temp;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String ans=longestNiceSubstring(s);
        System.out.println(ans);
    }
}
