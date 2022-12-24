package com.company;

import java.util.Scanner;

public class Number_of_segment_in_a_string {
    public static int countSegments(String s){
        if(s.length()==0){
            return 0;
        }
        int count=0;
        String[] ans=s.split(" ");
        for (String an : ans) {
            if (!an.equals("")) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.nextLine();
        int ans=countSegments(input);
        System.out.println(ans);
    }
}
