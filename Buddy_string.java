package com.company;

import java.util.Scanner;

public class Buddy_string {
    public static boolean buddyString(String s,String goal){
        int m = s.length(), n = goal.length();
        if (m != n) {
            return false;
        }
        int diff = 0;
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0; i < n; ++i) {
            int a = s.charAt(i), b = goal.charAt(i);
            ++cnt1[a - 'a'];
            ++cnt2[b - 'a'];
            if (a != b) {
                ++diff;
            }
        }
        boolean f = false;
        for (int i = 0; i < 26; ++i) {
            if (cnt1[i] != cnt2[i]) {
                return false;
            }
            if (cnt1[i] > 1) {
                f = true;
            }
        }
        return diff == 2 || (diff == 0 && f);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String goal= sc.next();
        boolean ans=buddyString(s,goal);
        System.out.println(ans);
    }
}
