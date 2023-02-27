package com.company;

import java.util.Scanner;

public class Valid_palindrome_ii {
    public static boolean validPalindromeHelper(String s,int start,int end){
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
    public static boolean validPalindrome(String s){
        int left = 0, right = s.length() - 1;
        while (left < right - 1) {
            if (s.charAt(left) != s.charAt(right)) {
                if (validPalindromeHelper(s, left, right - 1)) {
                    return true;
                }
                if (validPalindromeHelper(s, left + 1, right)) {
                    return true;
                }
                return false;
            }
            else {
                left ++;
                right --;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.next();
        boolean ans=validPalindrome(input);
        System.out.println(ans);
    }
}
