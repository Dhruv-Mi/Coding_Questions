package com.company;

import java.util.Scanner;

public class Reverse_each_word {
    public static String reverse(String str){
        String output="";
        int len=str.length();
        int i;
        for(i=len-1;i>=0;i--){
            output=output+str.charAt(i);
        }
        return output;
    }

    public static String reverseEachWord(String str){
        String output="";
        String temp="";
        int i,j=0;
        int len=str.length();
        for(i=0;i<len;i++){
            if(str.charAt(i)==' '){
                String temp1=reverse(temp);
                j=i+1;
                temp="";
                output=output.concat(temp1)+" ";
            }
            else{
                temp=temp+str.charAt(i);
            }
        }
        for(int k=len-1;k>=j;k--){
            output=output+str.charAt(k);
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.nextLine();
        String output;
        output=reverseEachWord(input);
        System.out.println(output);
    }
}
