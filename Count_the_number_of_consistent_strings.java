package com.company;

import java.util.Scanner;

public class Count_the_number_of_consistent_strings {
    public static int countConsistentStrings(String allowed,String[] words){
        int ans=0;
        for (String temp : words) {
            boolean check = true;
            for (int j = 0; j < temp.length(); j++) {
                char ch = temp.charAt(j);
                if (!allowed.contains(ch + "")) {
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
        String allowed= sc.next();
        int n= sc.nextInt();
        String[] words=new String[n];
        for(int i=0;i<n;i++){
            words[i]= sc.next();
        }
        int ans=countConsistentStrings(allowed,words);
        System.out.println(ans);
    }
}
