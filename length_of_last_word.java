package com.company;

import java.util.Scanner;

public class length_of_last_word {
    public static int lengthOfLastWord(String s){
        String[] temp=s.split(" ");
        return temp[temp.length-1].length();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.nextLine();
        int ans=lengthOfLastWord(input);
        System.out.println(ans);
    }
}
