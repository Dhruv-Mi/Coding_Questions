package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Ransom_notes {
    public static boolean canConstruct(String ransomNote,String magazine){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i), map.get(magazine.charAt(i))+1);
            }
            else{
                map.put(magazine.charAt(i),1);
            }
        }

        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)>1){
                    map.put(ch, map.get(ch)-1);
                }
                else{
                    map.remove(ch);
                }
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ransomNote= sc.next();
        String magazine= sc.next();
        boolean ans=canConstruct(ransomNote,magazine);
        System.out.println(ans);
    }
}
