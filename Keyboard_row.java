package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Keyboard_row {
    public static String[] findWords(String[] word){
        ArrayList<String> arr=new ArrayList<>();
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        for (String s : word) {
            String temp = s.toLowerCase();
            boolean check1 = true;
            boolean check2 = true;
            boolean check3 = true;
            int count = 0;
            for (int j = 0; j < temp.length(); j++) {
                char ch = temp.charAt(j);
                if (check1 && row1.contains(ch + "")) {
                    check2 = false;
                    check3 = false;
                    count++;
                }
                else if (check2 && row2.contains(ch + "")) {
                    check1 = false;
                    check3 = false;
                    count++;
                }
                else if(check3 && row3.contains(ch+"")){
                    check1 = false;
                    check2 = false;
                    count++;
                }
                else{
                    break;
                }
            }
            if (count == temp.length()) {
                arr.add(s);
            }
        }
        String[] ans=new String[arr.size()];
        for(int i=0;i< arr.size();i++){
            ans[i]= arr.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String[] word=new String[n];
        for(int i=0;i<n;i++){
            word[i]= sc.next();
        }
        String[] ans=findWords(word);
        for (String an : ans) {
            System.out.print(an + " ");
        }
    }
}
