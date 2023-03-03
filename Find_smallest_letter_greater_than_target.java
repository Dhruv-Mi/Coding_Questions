package com.company;

import java.util.Scanner;

public class Find_smallest_letter_greater_than_target {
    public static char nextGreatestLetter(char[] letters,char target){
        for (char letter : letters) {
            String temp = "" + letter;
            int count = temp.compareTo(target + "");
            if (count > 0) {
                return letter;
            }
        }
        return letters[0];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        char[] letters=new char[n];
        for(int i=0;i<n;i++){
            letters[i]=sc.next().charAt(0);
        }
        char target=sc.next().charAt(0);
        char ans=nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
}
