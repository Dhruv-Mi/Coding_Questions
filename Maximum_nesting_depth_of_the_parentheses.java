package com.company;

import java.util.Scanner;

public class Maximum_nesting_depth_of_the_parentheses {
    public static int maxDepth(String s){
        int length=s.length();
        int count=0;
        int ans=0;
        for(int i=0;i<length;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
                ans=Math.max(ans,count);
            }
            else if(ch==')'){
                count--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int ans=maxDepth(s);
        System.out.println(ans);
    }
}
