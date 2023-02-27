package com.company;

import java.util.Scanner;

public class Robot_return_to_zero {
    public static boolean judgeCircle(String moves){
        int y=0;
        int x=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U'){
                y++;
            }
            else if(ch=='D'){
                y--;
            }
            else if(ch=='R'){
                x++;
            }
            else{
                x--;
            }
        }
        return (x==0&&y==0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        boolean ans=judgeCircle(input);
        System.out.println(ans);
    }
}
