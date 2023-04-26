package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Decrypt_string_from_alphabet_to_integer_mapping {
    public static String freqAlphabets(String s){
        HashMap<String,Character> map=new HashMap<>();
        char ch='a';
        for(int i=1;i<=26;i++){
            map.put(i+"",ch);
            ch=(char) (ch+1);
        }
        String ans="";
        for(int i=0;i<s.length();i++){
            char chr=s.charAt(i);
            if(chr=='0'){
                ans=ans+'.';
            }
            else if(chr=='#'){
                String check=s.substring(i-2,i);
                ans=ans.substring(0,ans.length()-2);
                ans=ans+map.get(check);
            }
            else{
                ans=ans+map.get(chr+"");
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String ans=freqAlphabets(s);
        System.out.println(ans);
    }
}
