package com.company;

import java.util.Scanner;

public class Remove_character {
    public static String removeAllOccurrencesofchar(String str,char ch){
        String output="";
        int i,len=str.length();
        for(i=0;i<len;i++){
            if(str.charAt(i)!=ch){
                output=output+str.charAt(i);
            }
        }
        return  output;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.nextLine();
        char ch=sc.next().charAt(0);
        String output;
        output=removeAllOccurrencesofchar(input,ch);
        System.out.println(output);
    }
}
