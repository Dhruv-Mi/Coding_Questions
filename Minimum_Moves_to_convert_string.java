package com.company;

import java.util.Scanner;

public class Minimum_Moves_to_convert_string {
    public static int minimumMoves(String s){
        int ans=0;
        for(int i=0;i<s.length();i+=3){
            String temp;
            if(s.charAt(i)=='O'){
                i=i-2;
            }
            else {
                if (i + 3 <= s.length()) {
                    temp = s.substring(i, i + 3);
                } else {
                    temp = s.substring(i);
                }
                if (temp.contains("X")) {
//                System.out.println(temp+" "+ans);
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int ans=minimumMoves(s);
        System.out.println(ans);
    }
}
