package com.company;

import java.util.Scanner;

public class Make_the_string_good {
    public static String makeGood(String s){
        for(int i=0;i<s.length()-1;i++){
            String first=s.charAt(i)+"";
            String second=s.charAt(i+1)+"";
            if(first.equals(second)){
                continue;
            }
            if((first).equals(second.toLowerCase())||(first.toLowerCase()).equals(second)){
                if(i==0){
                    s=s.substring(2);
                    i=-1;
                }
                else{
                    s=s.substring(0,i)+s.substring(i+2);
                    i=i-2;
                }
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String ans=makeGood(s);
        System.out.println(ans);
    }
}
