package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Substring_of_size_three_with_distinct_characters {
    public static int countGoodSubstrings(String s){
        int ans=0;
        for(int i=0;i<=s.length()-3;i++){
            String temp=s.substring(i,i+3);
            ArrayList<Character> arr=new ArrayList<>();
            boolean check=true;
            for(int j=0;j<temp.length();j++){
                char ch=temp.charAt(j);
                if(!arr.contains(ch)){
                    arr.add(ch);
                }
                else{
                    check=false;
                    break;
                }
            }
            if(check){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int ans=countGoodSubstrings(s);
        System.out.println(ans);
    }
}
