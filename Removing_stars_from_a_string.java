package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Removing_stars_from_a_string {
    public static String removeStars(String s){
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='*'){
                arr.remove(arr.size()-1);
            }
            else{
                arr.add(ch);
            }
        }
        StringBuilder ans= new StringBuilder();
        for (Character character : arr) {
            ans.append(character);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans=removeStars(s);
        System.out.println(ans);
    }
}
