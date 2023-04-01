package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Remove_outermost_parenthesis {
    public static String removeOuterParenthesis(String s){
        String ans="";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.add(ch);
            }
            else if(ch==')'){
                if(st.size()>1){
                    ans=ans+ch;
                    st.pop();
                }
                else{
                    st.pop();
                }
            }
            else{
                st.add('(');
                ans=ans+'(';
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String ans=removeOuterParenthesis(s);
        System.out.println(ans);
    }
}
