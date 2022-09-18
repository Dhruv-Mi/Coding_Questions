package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class word_pattern {
    public static boolean wordPattern(String pattern,String s){
        ArrayList<String> arr=new ArrayList<>();
        String temp="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                arr.add(temp);
                temp="";
            }
            else{
                temp=temp+ch;
            }
        }
        arr.add(temp);
        if(pattern.length()!=arr.size()){
            return false;
        }
        else{
            HashMap<Character,String> map=new HashMap<>();
            for(int i=0;i<pattern.length();i++){
                char ch=pattern.charAt(i);
                if(map.containsKey(ch)){
                    String val=map.get(ch);
                    if(!Objects.equals(val, arr.get(i))){
                        return false;
                    }
                }
                else{
                    if(map.containsValue(arr.get(i))){
                        return false;
                    }
                    else {
                        map.put(ch, arr.get(i));
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pattern= sc.nextLine();
        String s= sc.nextLine();
        boolean ans=wordPattern(pattern,s);
        System.out.println(ans);
    }
}
