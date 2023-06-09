package com.company;

import java.util.Scanner;

public class Replace_all_digits_with_characters {
    public static String replaceDigits(String s){
        int length=s.length();
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<length;i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                char newCh= (char) (s.charAt(i-1)+Integer.parseInt(ch+""));
                ans.append(newCh);
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String ans=replaceDigits(s);
        System.out.println(ans);
    }
}
