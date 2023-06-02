package com.company;

import java.util.Scanner;

public class Maximum_repeating_substring {
    public static int maxRepeating(String sequence,String word){
        int wordLength=word.length();
        int sequenceLength=sequence.length();
        int ans=0;
        if(sequence.contains(word)) {
            for (int i = 0; i < sequenceLength; i++) {
                int count = 0;
                for (int j = i; j < sequenceLength; j++) {
                    char sequenceChar = sequence.charAt(j);
                    char wordChar = word.charAt(0);
                    if (sequenceChar == wordChar && j+wordLength<=sequenceLength) {
                        String temp = sequence.substring(j, j + wordLength);
                        if (temp.equals(word)) {
                            j = j + wordLength - 1;
                            count++;
                        } else {
                            ans = Math.max(ans, count);
                            count = 0;
                        }
                    } else {
                        ans = Math.max(ans, count);
                        count = 0;
                    }
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sequence=sc.next();
        String word= sc.next();
        int ans=maxRepeating(sequence,word);
        System.out.println(ans);
    }
}
