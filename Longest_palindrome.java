package com.company;

import java.util.Scanner;

public class Longest_palindrome {
    public static int longestPalindrome(String s){
        int[] chars = new int[52];
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if (c >= 'a' && c<= 'z') {
                chars[c - 'a'] ++;
            }
            else {
                chars[c - 'A' + 26] ++;
            }
        }
        int count = 0;
        for (int aChar : chars) {
            count += aChar / 2;
        }
        count = count * 2;
        return Math.min(s.length(), count + 1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.next();
        int output=longestPalindrome(input);
        System.out.println(output);
    }
}
