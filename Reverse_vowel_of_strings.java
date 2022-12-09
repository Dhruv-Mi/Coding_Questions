package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_vowel_of_strings {
    public static String reverseVowel(String s){
        ArrayList<Character> vowel=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowel.add(ch);
            }
        }
        int index= vowel.size()-1;
        StringBuilder output= new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                output.append(vowel.get(index));
                index--;
            }
            else{
                output.append(ch);
            }
        }
        return output.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.next();
        String output=reverseVowel(input);
        System.out.println(output);
    }
}
