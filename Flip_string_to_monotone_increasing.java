package com.company;

import java.util.Scanner;

public class Flip_string_to_monotone_increasing {
    public static int minFlipsMonoInc(String s){
        int onestop=0;
        int flipcount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                onestop++;
            }
            else{
                if(onestop>0){
                    flipcount++;
                }
            }
            flipcount=Math.min(onestop,flipcount);
        }
        return flipcount;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int ans=minFlipsMonoInc(s);
        System.out.println(ans);
    }
}
