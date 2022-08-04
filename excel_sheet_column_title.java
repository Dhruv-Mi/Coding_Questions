package com.company;

import java.util.Scanner;

public class excel_sheet_column_title {
    public static String convertToTitle(int columnNumber){
        String ans="";
        while(columnNumber!=0){
            int temp = columnNumber % 26;
            columnNumber = columnNumber / 26;
            if (temp == 0) {
                ans = 'Z' + ans;
                columnNumber--;
            } else {
                ans = (char) (64 + temp) + ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String ans=convertToTitle(n);
        System.out.println(ans);
    }
}
