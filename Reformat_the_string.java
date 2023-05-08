package com.company;

import java.util.Scanner;

public class Reformat_the_string {
    public static String reformat(String s){
        StringBuilder alphabet= new StringBuilder();
        StringBuilder number= new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                number.append(ch);
            }
            else{
                alphabet.append(ch);
            }
        }
        if(Math.abs(alphabet.length()-number.length())>1){
            return "";
        }
        else{
            StringBuilder ans= new StringBuilder();
            int i=0;
            int j=0;
            if(alphabet.length()>=number.length()){
                while(i<alphabet.length() && j<number.length()){
                    ans.append(alphabet.charAt(i)).append(number.charAt(j));
                    i++;
                    j++;
                }
                if(i<alphabet.length()) {
                    ans.append(alphabet.charAt(i));
                }
            }
            else{
                while(i<number.length() && j<alphabet.length()){
                    ans.append(number.charAt(i)).append(alphabet.charAt(j));
                    i++;
                    j++;
                }
                ans.append(number.charAt(i));
            }
            return ans.toString();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String ans=reformat(s);
        System.out.println(ans);
    }
}
