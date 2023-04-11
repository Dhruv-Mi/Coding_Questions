package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Maximum_number_of_balloons {
    public static int maxNumberOfBalloons(String text){
        HashMap<Character,Integer> map=new HashMap<>();
        String check="balloon";
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(check.contains(ch+"")){
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }
                else{
                    map.put(ch,1);
                }
            }
        }
        int ans= Integer.MAX_VALUE;
        String loop="ablon";
        for(int i=0;i<loop.length();i++){
            char ch=loop.charAt(i);
            if(map.containsKey(ch)) {
                if (ch == 'l' || ch == 'o') {
                    ans = Math.min(ans, map.get(ch) / 2);
                } else {
                    ans = Math.min(ans, map.get(ch));
                }
            }
            else{
                map.put(ch,0);
                ans=0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text= sc.next();
        int ans=maxNumberOfBalloons(text);
        System.out.println(ans);
    }
}
