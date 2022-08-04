package com.company;

import java.util.Scanner;

public class Minimum_length_word {
    public static String minLengthWord(String input){
        int len=input.length();
        String output="";
        int i;
        String temp="";
        int l=Integer.MAX_VALUE;
        int j=0;
        for(i=0;i<len;i++){
            if(input.charAt(i)==' '){
                int len1=temp.length();
                if(len1<l){
                    output=temp;
                    l=len1;
                }
                temp="";
                j=i;
            }
            else{
                temp=temp+input.charAt(i);
            }
        }
        String temp1="";
        for(int k=j+1;k<len;k++){
            temp1=temp1+input.charAt(k);
        }
        if(temp1.length()<l){
            output=temp1;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.nextLine();
        String output;
        output=minLengthWord(input);
        System.out.println(output);
    }
}
