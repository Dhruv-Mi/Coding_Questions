package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class valid_anagram {
    public static boolean isAnagram(String S,String T){
        HashMap<Character,Integer> map=new HashMap<>();
        if(S.length()!=T.length()){
            return false;
        }
        else{
            for(int i=0;i<S.length();i++){
                if(map.containsKey(S.charAt(i))){
                    int value=map.get(S.charAt(i));
                    map.replace(S.charAt(i),value+1);
                }
                else{
                    map.put(S.charAt(i),1);
                }
            }
            for(int i=0;i<T.length();i++){
                char temp=T.charAt(i);
                if(map.containsKey(temp)){
                    int value=map.get(temp);
                    if(value==0){
                        return false;
                    }
                    else{
                        map.replace(temp,value-1);
                    }
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        boolean ans=isAnagram(s,t);
        System.out.println(ans);
    }
}
