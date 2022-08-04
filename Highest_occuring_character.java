package com.company;

import java.util.Scanner;

public class Highest_occuring_character {
    public static char highestOccuringChar(String str){
        int i,j,len=str.length();
        int sum=0;
        char ch;
        char output='0';
        for(i=0;i<len-1;i++){
            int k=0;
            ch=str.charAt(i);
            for(j=i;j<len;j++){
                if(str.charAt(i)==str.charAt(j)){
                    k++;
                }
            }
            if(k>sum){
                sum=k;
                output=ch;
            }
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        char output;
        output=highestOccuringChar(input);
        System.out.println(output);
    }
}
