package com.company;

import java.util.Scanner;

public class Check_if_all_characters_have_equal_number_of_occurrences {
    public static boolean areOccurrencesEqual(String s){
        int[] temp=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            temp[ch-'a']++;
        }
        int val=temp[s.charAt(0)-'a'];
        for(int i=0;i<26;i++){
            if(temp[i]!=val && temp[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean ans=areOccurrencesEqual(s);
        System.out.println(ans);
    }
}
