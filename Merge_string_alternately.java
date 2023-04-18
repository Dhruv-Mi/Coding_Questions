package com.company;

import java.util.Scanner;

public class Merge_string_alternately {
    public static String mergeAlternately(String word1,String word2){
        StringBuilder ans= new StringBuilder();
        int i=0;
        int j=0;
        while(i<word1.length() && j<word2.length()){
            ans.append(word1.charAt(i)).append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<word1.length()){
            ans.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length()){
            ans.append(word2.charAt(j));
            j++;
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word1= sc.next();
        String word2= sc.next();
        String ans=mergeAlternately(word1,word2);
        System.out.println(ans);
    }
}
