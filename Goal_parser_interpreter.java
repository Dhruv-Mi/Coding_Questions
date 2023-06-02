package com.company;

import java.util.Scanner;

public class Goal_parser_interpreter {
    public static String interpret(String command){
        int n=command.length();
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=command.charAt(i);
            if(ch=='('){
                if(command.charAt(i+1)==')'){
                    ans.append('o');
                    i=i+1;
                }
                else{
                    ans.append("al");
                    i=i+3;
                }
            }
            else{
                ans.append('G');
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String command= sc.next();
        String ans=interpret(command);
        System.out.println(ans);
    }
}
