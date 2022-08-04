package com.company;

import java.util.Scanner;

public class implement_strStr {
    public static int strStr(String haystack,String needle){
        int ans=-1;
        boolean temp=haystack.contains(needle);
        if(temp){
            int j=0;
            int len=needle.length();
            for(int i=0;i<haystack.length();i++){
                if(haystack.charAt(i)==needle.charAt(j)){
                    String subst=haystack.substring(i,i+len);
                    if(subst.equals(needle)){
                        return i;
                    }
                }
            }
        }
        else {
            return ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String haystack= sc.next();
        String needle= sc.next();
        int ans=strStr(haystack,needle);
        System.out.println(ans);
    }
}
