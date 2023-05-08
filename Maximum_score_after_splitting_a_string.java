package com.company;

import java.util.Scanner;

public class Maximum_score_after_splitting_a_string {
    public static int maxScore(String s){
        int right=0;
        int left=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                right++;
            }
        }
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            if(ch=='0'){
                left++;
            }
            else{
                right--;
            }
            ans=Math.max(ans,left+right);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int ans=maxScore(s);
        System.out.println(ans);
    }
}
