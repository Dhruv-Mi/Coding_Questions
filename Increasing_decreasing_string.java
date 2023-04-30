package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Increasing_decreasing_string {
    public static String sortString(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        StringBuilder ans= new StringBuilder();
        while(!map.isEmpty()){
            for(int i=0;i<=25;i++){
                char ch= (char) ('a'+i);
                if(map.containsKey(ch)){
                    if(map.get(ch)>1){
                        ans.append(ch);
                        map.put(ch,map.get(ch)-1);
                    }
                    else{
                        ans.append(ch);
                        map.remove(ch);
                    }
                }
            }
            for(int i=25;i>=0;i--){
                char ch=(char)('a'+i);
                if(map.containsKey(ch)){
                    if(map.get(ch)>1){
                        ans.append(ch);
                        map.put(ch,map.get(ch)-1);
                    }
                    else{
                        ans.append(ch);
                        map.remove(ch);
                    }
                }
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String ans=sortString(s);
        System.out.println(ans);
    }
}
