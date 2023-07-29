package com.company;

import java.util.Scanner;

public class Minimum_time_to_type_word_using_special_typewriter {
    public static int minTimeToType(String word){
        int ans=word.length();
        int temp1=Math.abs(word.charAt(0)-'a');
        int temp2=Math.abs(26-temp1);
        ans=ans+Math.min(temp1,temp2);
        for(int i=1;i<word.length();i++){
            char prev=word.charAt(i-1);
            char present=word.charAt(i);
            temp1=Math.abs(present-prev);
            temp2=Math.abs(26-temp1);
            ans=ans+Math.min(temp1,temp2);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        int ans=minTimeToType(word);
        System.out.println(ans);
    }
}
