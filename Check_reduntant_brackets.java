package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Check_reduntant_brackets {
    public static boolean checkReduntantBrackets(String expression){
        Stack<Character> stack=new Stack<Character>();
        int count=0;
        for(int i=0;i<expression.length();i++)
        {
            char c=expression.charAt(i);
            //System.out.print(c);

            if (c==')')
            {
                //System.out.println();
                while(!stack.isEmpty() && stack.peek()!='(')
                {
                    count=count+1;
                    stack.pop();
                    //System.out.print(stack.pop());
                }
                //System.out.println();
                //System.out.println(count);
                if (count==0 || count==1)
                {
                    return true;
                }
                stack.pop();
                count=0;

            }
            else
            {
                stack.push(c);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.nextLine();
        boolean ans=checkReduntantBrackets(input);
        System.out.println(ans);
    }
}
