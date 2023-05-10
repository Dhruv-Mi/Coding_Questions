package com.company;

import java.util.Scanner;

public class Consecutive_character {
    public static int maxPower(String s){
        int ans=Integer.MIN_VALUE;
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                ans=Math.max(count,ans);
                count=1;
            }
            else{
                count++;
            }
        }
        ans=Math.max(ans,count);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int ans=maxPower(s);
        System.out.println(ans);
    }
}
