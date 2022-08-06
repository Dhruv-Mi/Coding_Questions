package com.company;

import java.util.Scanner;

public class smallest_super_sequence {
    public static int smallestSuperSequence(String s,String t){
        return smallestSuperSequenceHelp(s,t,0,0);
    }
    public static int smallestSuperSequenceHelp(String s,String t,int sIndex,int tIndex){
        if(sIndex>s.length()-1){
            return t.length()-tIndex;
        }
        if(tIndex>t.length()-1){
            return s.length()-sIndex;
        }
        if(s.charAt(sIndex)==t.charAt(tIndex)){
            return 1+smallestSuperSequenceHelp(s,t,sIndex+1,tIndex+1);
        }
        int opt1=smallestSuperSequenceHelp(s,t,sIndex,tIndex+1);
        int opt2=smallestSuperSequenceHelp(s,t,sIndex+1,tIndex);
        return Math.min(opt1,opt2)+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String t= sc.next();
        int ans=smallestSuperSequence(s,t);
        System.out.println(ans);
    }
}
