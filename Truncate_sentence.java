package com.company;

import java.util.Scanner;

public class Truncate_sentence {
    public static String truncateSentence(String s,int k){
        String[] word=s.split(" ");
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<k;i++){
            ans.append(word[i]).append(" ");
        }
        ans = new StringBuilder(ans.substring(0, ans.length() - 1));
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        int k= sc.nextInt();
        String ans=truncateSentence(s,k);
        System.out.println(ans);
    }
}
