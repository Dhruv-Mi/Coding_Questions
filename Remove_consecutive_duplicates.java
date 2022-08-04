package com.company;

import java.util.Scanner;

public class Remove_consecutive_duplicates {
    public static String removeConsecutiveDuplicate(String str){
        String output=str.charAt(0)+"";
        char last_char=str.charAt(0);
        int len=str.length();
        for(int i=1;i<len;i++){
            if(str.charAt(i)!=last_char){
                output=output+str.charAt(i);
                last_char=str.charAt(i);
            }
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        String output;
        output=removeConsecutiveDuplicate(str);
        System.out.println(output);
    }
}
