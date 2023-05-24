package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Rearrange_spaces_between_words {
    public static String reorderSpaces(String text){
        int length=text.length();
        int count=0;
        StringBuilder temp= new StringBuilder();
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<length;i++){
            char ch=text.charAt(i);
            if(ch==' '){
                if(!temp.toString().equals("")) {
                    arr.add(temp.toString());
                }
                temp = new StringBuilder();
                count++;
            }
            else{
                temp.append(ch);
            }
        }
        if(temp.length()!=0){
            arr.add(temp.toString());
        }
        if(arr.size()==1){
            StringBuilder ans= new StringBuilder(arr.get(0));
            for(int i=0;i<count;i++){
                ans.append(" ");
            }
            return ans.toString();
        }
        else {
            int between = (count / (arr.size() - 1));
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < arr.size(); i++) {
                ans.append(arr.get(i));
                if (i != arr.size() - 1) {
                    for (int j = 0; j < between; j++) {
                        ans.append(" ");
                        count--;
                    }
                }
            }
            ans.append(" ".repeat(Math.max(0, count)));
            return ans.toString();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String ans=reorderSpaces(text);
        System.out.println(ans);
    }
}
