package com.company;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Find_the_difference {
    public static char findTheDifference(String s,String t){
        if(Objects.equals(s, "")){
            return t.charAt(0);
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(map.containsKey(temp)){
                int value= map.get(temp)+1;
                map.put(temp,value);
            }
            else{
                map.put(temp,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char temp=t.charAt(i);
            if(!map.containsKey(temp)){
                return temp;
            }
            else {
                if(map.get(temp)>1){
                    map.put(temp, map.get(temp)-1);
                }
                else{
                    map.remove(temp);
                }
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String t= sc.next();
        char ans=findTheDifference(s,t);
        System.out.println(ans);
    }
}
