package com.company;

import java.util.Scanner;

public class Reverse_prefix_of_word {
    public static String reversePrefix(String word,char ch){
        int index=word.indexOf(ch);
        StringBuilder temp= new StringBuilder(word.substring(0, index + 1));
        String ans= String.valueOf(temp.reverse());
        ans=ans+word.substring(index+1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word= sc.next();
        char ch=sc.next().charAt(0);
        String ans=reversePrefix(word,ch);
        System.out.println(ans);
    }
}
