package com.company;

import java.util.Scanner;

public class Check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence {
    public static int isPrefixOfWord(String sentence,String searchWord){
        String[] temp=sentence.split(" ");
        for(int i=0;i< temp.length;i++){
            String check=temp[i];
            if(check.contains(searchWord)){
                if(check.indexOf(searchWord)==0){
                    return i+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence= sc.nextLine();
        String searchWord= sc.next();
        int ans=isPrefixOfWord(sentence,searchWord);
        System.out.println(ans);
    }
}
