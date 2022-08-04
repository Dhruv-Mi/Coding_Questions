package com.company;

import java.util.Scanner;
import java.util.Stack;

public class valid_parenthesis {
    public static boolean isValid(String s){
        int len=s.length();
        Stack<Character> pending=new Stack<>();
        int count=0;
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                pending.push(ch);
                count++;
            }
            else if(ch==')' && !pending.isEmpty()){
                if(pending.peek()=='('){
                    pending.pop();
                    count--;
                }
                else{
                    return false;
                }
            }
            else if(ch=='}' && !pending.isEmpty()){
                if(pending.peek()=='{'){
                    pending.pop();
                    count--;
                }
                else{
                    return false;
                }
            }
            else if(ch==']' && !pending.isEmpty()){
                if(pending.peek()=='['){
                    pending.pop();
                    count--;
                }
                else{
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return count == 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.nextLine();
        boolean ans=isValid(input);
        System.out.println(ans);
    }
}
