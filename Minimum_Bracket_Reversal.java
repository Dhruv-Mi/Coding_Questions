package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Minimum_Bracket_Reversal {
    public static int countBracketReversal(String input){
        int len=input.length();
        if(len%2!=0){
            return -1;
        }
        else{
            Stack<Character> st=new Stack<>();
            int count=0;
            for(int i=0;i<len;i++){
                char c=input.charAt(i);
                if(c=='{'){
                    st.push(c);
                    count++;
                }
                else if(c=='}'){
                    if(!st.isEmpty()&&st.peek()=='{'){
                        st.pop();
                        count--;
                    }
                    else {
                        st.push(c);
                        count++;
                    }
                }
            }
            if(count%2==0){
                return count/2;
            }
            else {
                return -1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.nextLine();
        int ans=countBracketReversal(input);
        System.out.println(ans);
    }
}
