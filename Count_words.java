package com.company;

import java.util.Scanner;

public class Count_words {
    public static int countWords(String str){
        int i;
        int count=1;
        for(i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1= sc.nextLine();
        int count=countWords(str1);
        System.out.println(count);
    }
}
