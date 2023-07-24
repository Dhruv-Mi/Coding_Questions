package com.company;

import java.util.Scanner;

public class Maximum_number_of_words_you_can_type {
    public static int canBeTypedWords(String text,String brokenLetters){
        String[] arr=text.split(" ");
        int ans=0;
        for (String s : arr) {
            boolean check = true;
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (brokenLetters.contains(ch + "")) {
                    check = false;
                    break;
                }
            }
            if (check) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String brokenLetters= sc.next();
        int ans=canBeTypedWords(text,brokenLetters);
        System.out.println(ans);
    }
}
