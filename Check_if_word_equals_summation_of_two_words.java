package com.company;

import java.util.Scanner;

public class Check_if_word_equals_summation_of_two_words {
    public static int findNum(String s){
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            ans=ans*10+(ch-'a');
        }
        return ans;
    }
    public static boolean isSumEqual(String firstWord,String secondWord,String targetWord){
        int firstNum=findNum(firstWord);
        int secondNum=findNum(secondWord);
        int targetNum=findNum(targetWord);
        return (firstNum+secondNum)==targetNum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstWord= sc.next();
        String secondWord= sc.next();
        String targetWord= sc.next();
        boolean ans=isSumEqual(firstWord,secondWord,targetWord);
        System.out.println(ans);
    }
}
