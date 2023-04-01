package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Find_common_characters {
    public static List<String> commonChars(String[] words){
        String start=words[0];
        List<String> ans=new ArrayList<>();
        for(int i=0;i<start.length();i++){
            char ch=start.charAt(i);
            boolean check=true;
            for(int j=1;j< words.length;j++){
                if(!words[j].contains(ch+"")){
                    check=false;
                    break;
                }
                else{
                    int index=words[j].indexOf(ch);
                    words[j]=words[j].substring(0,index)+words[j].substring(index+1);
                }
            }
            if(check){
                ans.add(ch+"");
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
        List<String> ans=commonChars(words);
        for (String an : ans) {
            System.out.print(an + " ");
        }
    }
}
