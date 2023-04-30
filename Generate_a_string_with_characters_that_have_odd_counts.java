package com.company;

import java.util.Scanner;

public class Generate_a_string_with_characters_that_have_odd_counts {
    public static String generateTheString(int n){
        StringBuilder ans;
        if(n%2==1){
            ans = new StringBuilder();
            ans.append("a".repeat(n));
        }
        else{
            ans = new StringBuilder("" + 'a');
            ans.append("b".repeat(Math.max(0, n - 1)));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String ans=generateTheString(n);
        System.out.println(ans);
    }
}
