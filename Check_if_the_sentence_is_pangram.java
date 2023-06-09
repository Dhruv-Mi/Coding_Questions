package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Check_if_the_sentence_is_pangram {
    public static boolean checkIfPangram(String sentence){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
        }
        return map.size()==26;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence= sc.next();
        boolean ans=checkIfPangram(sentence);
        System.out.println(ans);
    }
}
