package com.company;

import java.util.Scanner;

public class Backspace_string_comaprison {
    public static boolean backspaceCompare(String s,String t){
        int len1=s.length();
        int len2=s.length();
        int i;
        String temp1="";
        String temp2="";
        for(i=1;i<len1;i++){
            if(s.charAt(i)!='#'){
                temp1=temp1+s.charAt(i-1);
            }
        }
        for(int j=1;j<len2;j++){
            if(t.charAt(j)!='#'){
                temp2=temp2+t.charAt(j-1);
            }
        }
        if(temp1==temp2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String t= sc.nextLine();
        boolean ans=backspaceCompare(s,t);
        System.out.println(ans);
    }
}
