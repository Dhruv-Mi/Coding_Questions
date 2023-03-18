package com.company;

import java.util.*;

public class Most_common_word {
    public static String mostCommonWord(String paragraph,String[] banned){
        HashMap<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>(Arrays.asList(banned));

        for(String i : paragraph.replaceAll("\\W+" , " ").toLowerCase().split("\\s+")){
            if(!set.contains(i))map.put(i, map.getOrDefault(i,0)+1);
        }

        int max = Integer.MIN_VALUE;
        String res = "";
        for(String i : map.keySet()){
            if(map.get(i) > max){
                max = map.get(i);
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String  paragraph= "a.";
        String[] banned=new String[n];
        for(int i=0;i<n;i++){
            banned[i]= sc.next();
        }
        String ans=mostCommonWord(paragraph,banned);
        System.out.println(ans);
    }
}
