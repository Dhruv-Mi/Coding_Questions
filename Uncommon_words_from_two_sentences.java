package com.company;

import java.util.*;

public class Uncommon_words_from_two_sentences {
    public static String[] uncommonFromSentence(String s1,String s2){
        String[] s1_arr=s1.split(" ");
        String[] s2_arr=s2.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for (String temp : s1_arr) {
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }
        for (String temp : s2_arr) {
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }
        String[] keys=map.keySet().toArray(new String[0]);
        ArrayList<String> ans=new ArrayList<>();
        for (String key : keys) {
            if (map.get(key) == 1) {
                ans.add(key);
            }
        }
        String[] result=new String[ans.size()];
        for(int i=0;i< result.length;i++){
            result[i]=ans.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1="apple apple";
        String s2="banana";
        String[] ans=uncommonFromSentence(s1,s2);
        for (String an : ans) {
            System.out.print(an + " ");
        }
    }
}
