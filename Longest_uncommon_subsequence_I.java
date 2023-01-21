package com.company;

import java.util.Scanner;

public class Longest_uncommon_subsequence_I {
    public static int findLUSLength(String a, String b){
        if(a.length()==0||b.length()==0){
            if(a.length()==0){
                return b.length();
            }
            else{
                return a.length();
            }
        }
        if(a.equals(b)){
            return -1;
        }
        if(a.charAt(0)!=b.charAt(0)){
            return 1+findLUSLength(a.substring(1),b.substring(1));
        }
        else{
            int ans = Math.max(findLUSLength(a,b.substring(1)),findLUSLength(a.substring(1),b));
            if(ans==0){
                return -1;
            }
            else{
                return ans;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.next();
        String b= sc.next();
        int ans= findLUSLength(a,b);
        System.out.println(ans);
    }
}
