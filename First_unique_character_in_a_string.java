package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class First_unique_character_in_a_string {
    public static int firstUniqueChar(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.next();
        int ans=firstUniqueChar(input);
        System.out.println(ans);
    }
}
