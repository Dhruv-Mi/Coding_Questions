package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Find_words_that_can_be_formed_by_character {
    public static int countCharacters(String[] words,String chars){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<chars.length();i++){
            char ch=chars.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        int ans=0;
        for (String s : words) {
            boolean check = true;
            HashMap<Character, Integer> temp = new HashMap<>(map);
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (!temp.containsKey(ch)) {
                    check = false;
                    break;
                } else {
                    if (temp.get(ch) > 1) {
                        temp.put(ch, temp.get(ch) - 1);
                    } else {
                        temp.remove(ch);
                    }
                }
            }
            if (check) {
                ans = ans + s.length();
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String[] words=new String[n];
        for(int i=0;i<n;i++){
            words[i]= sc.next();
        }
        String chars= sc.next();
        int ans=countCharacters(words,chars);
        System.out.println(ans);
    }
}
