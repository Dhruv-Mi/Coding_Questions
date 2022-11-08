package com.company;

import java.util.Scanner;

public class encoding_message {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            String input=sc.next();
            String step_1="";
            for(int j=0;j<input.length()-1;j+=2){
                step_1=step_1+input.charAt(j+1)+input.charAt(j);
            }
            if(n%2!=0){
                step_1=step_1+input.charAt(input.length()-1);
            }
            System.out.println(step_1);
            String output="";
            for(int k=0;k<step_1.length();k++){
                int c=(int)step_1.charAt(k)-96;
                c=27-c;
                char ch=(char) (c+96);
                output=output+ch;
            }
            System.out.println(output);
        }
    }
}
