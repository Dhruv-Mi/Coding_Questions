package com.company;

import java.util.Scanner;

public class Remove_all_adjacent_duplicates_in_string {
    public static String removeDuplicates(String s){
        for(int i=0;i<s.length()-1;i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            if(ch1==ch2){
                s=s.substring(0,i)+s.substring(i+2);
                if(i==0){
                    i=i-1;
                }
                else {
                    i = i - 2;
                }
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String ans=removeDuplicates(s);
        System.out.println(ans);
    }
}
