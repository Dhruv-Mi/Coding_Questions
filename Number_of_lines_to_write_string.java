package com.company;

import java.util.Scanner;

public class Number_of_lines_to_write_string {
    public static int[] numberOfLines(int[] width,String s){
        int lines=1;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ch_width=width[ch-'a'];
            count=count+ch_width;
            if(count>100){
                count=0;
                lines++;
                i--;
            }
        }
        int[] ans=new int[2];
        ans[0]=lines;
        ans[1]=count;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] width=new int[26];
        for(int i=0;i<26;i++){
            width[i]= sc.nextInt();
        }
        String s= sc.next();
        int[] ans=numberOfLines(width,s);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
