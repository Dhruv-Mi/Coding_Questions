package com.company;

import java.util.Scanner;

public class isSubsequence {

    public static boolean IsSubsequence(String s,String t){
        return checkSubsequence(s,t,s.length() - 1 , t.length() - 1);
    }

    private static boolean checkSubsequence(String s,String t,int i, int j) {
        if(i==-1){
            return true;
        }
        if(j==-1){
            return false;
        }
        if(s.charAt(i)==t.charAt(j)){
            return checkSubsequence(s,t,i-1,j-1);
        }
        else{
            return checkSubsequence(s,t,i,j-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String t= sc.next();
        boolean ans=IsSubsequence(s,t);
        System.out.println(ans);
    }
}
