package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Shortest_completing_word {
    public static String shortestCompletingWords(String licensePlate,String[] words){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<licensePlate.length();i++){
            char ch=Character.toLowerCase(licensePlate.charAt(i));
            if(ch!='0'&&ch!='1'&&ch!='2'&&ch!='3'&&ch!='4'&&ch!='5'&&ch!='6'&&ch!='7'&&ch!='8'&&ch!='9'&&ch!=' '){
                if(map.containsKey(ch)){
                    map.put(ch, map.get(ch)+1);
                }
                else{
                    map.put(ch,1);
                }
            }
        }
        String ans="";
        int length=Integer.MAX_VALUE;
        for (String temp : words) {
            HashMap<Character, Integer> check = new HashMap<>(map);
            if(length>temp.length()) {
                for (int j = 0; j < temp.length(); j++) {
                    char ch = Character.toLowerCase(temp.charAt(j));
                    if (check.containsKey(ch)) {
                        if(check.get(ch)>1) {
                            check.put(ch, check.get(ch) - 1);
                        }
                        else{
                            check.remove(ch);
                        }
                    }
                }
                if (check.isEmpty()) {
                    ans = temp;
                    length = temp.length();
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String licensePlate= sc.nextLine();
        int n= sc.nextInt();
        String[] words=new String[n];
        for(int i=0;i<n;i++){
            words[i]=sc.next();
        }
        String ans=shortestCompletingWords(licensePlate,words);
        System.out.println(ans);
    }
}
