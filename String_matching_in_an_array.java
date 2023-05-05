package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String_matching_in_an_array {
    public static List<String> stringMatching(String[] words){
        List<String> ans=new ArrayList<>();
        for (String temp : words) {
            for (String check : words) {
                if (temp.length() < check.length()) {
                    if (check.contains(temp)) {
                        ans.add(temp);
                        break;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String[] words=new String[n];
        for(int i=0;i<n;i++){
            words[i]= sc.next();
        }
        List<String> ans=stringMatching(words);
        for (String an : ans) {
            System.out.print(an + " ");
        }
    }
}
