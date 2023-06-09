package com.company;

import java.util.Scanner;

public class Sorting_the_sentence {
    public static String sortSentence(String s){
        String[] words=s.split(" ");
        String[] newWords=new String[words.length+1];
        for (String temp : words) {
            int index = Integer.parseInt(String.valueOf(temp.charAt(temp.length() - 1)));
            newWords[index] = temp.substring(0, temp.length() - 1);
        }
        StringBuilder ans= new StringBuilder();
        for(int i=1;i< newWords.length-1;i++){
            ans.append(newWords[i]).append(" ");
        }
        ans.append(newWords[newWords.length - 1]);
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String ans=sortSentence(s);
        System.out.println(ans);
    }
}
