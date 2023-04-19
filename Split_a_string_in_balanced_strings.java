package com.company;

import java.util.Scanner;

public class Split_a_string_in_balanced_strings {
    public static int balancedString(String s){
        if(s.length() == 0)
            return 0;
        int r=0,l=0;
        int ans = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'R'){
                r++;
            }
            else if(s.charAt(i) == 'L'){
                l++;
            }
            if(r == l){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int ans=balancedString(s);
        System.out.println(ans);
    }
}
