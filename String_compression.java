package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class String_compression {
    public static int compress(char[] chars){
        HashMap<Character,Integer> map=new HashMap<>();
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                map.put(aChar, map.get(aChar) + 1);
            } else {
                map.put(aChar, 1);
            }
        }
        StringBuilder ans= new StringBuilder();
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                if (map.get(aChar) == 1) {
                    ans.append(aChar);
                } else {
                    ans.append(aChar).append(map.get(aChar));
                }
                map.remove(aChar);
            }
        }
        return ans.length();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        char[] chars=new char[n];
        for(int i=0;i<n;i++){
            chars[i]=sc.next().charAt(0);
        }
        int ans=compress(chars);
        System.out.println(ans);
    }
}
