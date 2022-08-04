package com.company;

import java.util.Scanner;

public class excel_sheet_column_number {
    public static int titleToNumber(String columnTitle){
        int count=0;
        char[] temp=columnTitle.toCharArray();
        for (char c : temp) {
            count = count * 26 + (c - '@');
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.next();
        int ans=titleToNumber(input);
        System.out.println(ans);
    }
}
