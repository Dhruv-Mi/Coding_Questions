package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class isomorphic_string {
    public static boolean isIsomorphic(String s,String t){
        int sLength=s.length();
        int tLength=t.length();
        if(sLength!=tLength){
            return false;
        }
        else if (s.equals(t)) {
            return true;
        }
        else{
            HashMap<Character,Character> map=new HashMap<>();
            HashMap<Character,Integer> map2=new HashMap<>();
            int index=0;
            StringBuilder ans= new StringBuilder();
            while (index<sLength){
                char ch=s.charAt(index);
                if(map.containsKey(ch)){
                    ans.append(map.get(ch));
                }
                else{
                    char temp=t.charAt(index);
                    if(map2.containsKey(temp)) {
                        return false;
                    }
                    else{
                        map.put(ch, t.charAt(index));
                        ans.append(t.charAt(index));
                        map2.put(temp, 1);
                    }

                }
                index++;
            }
            return ans.toString().equals(t);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t= sc.next();
        boolean ans=isIsomorphic(s,t);
        System.out.println(ans);
    }
}
