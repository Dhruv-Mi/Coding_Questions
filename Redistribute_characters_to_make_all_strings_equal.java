package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Redistribute_characters_to_make_all_strings_equal {
    public static boolean makeEqual(String[] words){
        HashMap<Character,Integer> map=new HashMap<>();
        ArrayList<Character> letter=new ArrayList<>();
        for (String word : words) {
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
                if (!letter.contains(ch)) {
                    letter.add(ch);
                }
            }
        }
        for (char ch : letter) {
            if (map.get(ch) % words.length != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String[] words=new String[n];
        for(int i=0;i<n;i++){
            words[i]= sc.next();
        }
        boolean ans=makeEqual(words);
        System.out.println(ans);
    }
}
