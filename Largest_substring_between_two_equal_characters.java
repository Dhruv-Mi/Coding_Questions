package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Largest_substring_between_two_equal_characters {
    public static int maxLengthBetweenEqualCharacters(String s){
        int ans=-1;
        int length=s.length();
        HashMap<Character, ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<length;i++){
            char ch=s.charAt(i);
            ArrayList<Integer> temp;
            if(map.containsKey(ch)){
                temp = map.get(ch);
            }
            else{
                temp = new ArrayList<>();
            }
            temp.add(i);
            map.put(ch,temp);
        }
        Character[] keys=map.keySet().toArray(new Character[0]);
        for (char key : keys) {
            ArrayList<Integer> temp = map.get(key);
            if (temp.size() > 1) {
                int diff=temp.get(temp.size()-1)-temp.get(0)-1;
                ans=Math.max(ans,diff);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int ans=maxLengthBetweenEqualCharacters(s);
        System.out.println(ans);
    }
}
