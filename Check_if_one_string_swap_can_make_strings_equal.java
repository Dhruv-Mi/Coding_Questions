package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Check_if_one_string_swap_can_make_strings_equal {
    public static boolean areAlmostEqual(String s1,String s2){
        int count=0;
        int length=s1.length();
        if(s1.equals(s2)){
            return true;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<length;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
            }
            else{
                map.put(s1.charAt(i),1);
            }
        }
        for(int i=0;i<length;i++){
            char ch=s2.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)>1){
                    map.put(ch,map.get(ch)-1);
                }
                else{
                    map.remove(ch);
                }
            }
            else{
                return false;
            }
        }
        return count==2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= sc.next();
        String s2= sc.next();
        boolean ans=areAlmostEqual(s1,s2);
        System.out.println(ans);
    }
}
