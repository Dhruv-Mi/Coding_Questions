package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Shortest_Distance_to_a_Character {
    public static int[] shortestToChar(String s,char c){
        ArrayList<Integer> temp=new ArrayList<>();
        int[] ans=new int[s.length()];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==c){
                temp.add(i);
            }
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==c){
                ans[i]=0;
            }
            else{
                ans[i]=shortestToCharHelper(temp,i);
            }
        }
        return ans;
    }
    public static int shortestToCharHelper(ArrayList<Integer> temp,int index){
        int ans=Integer.MAX_VALUE;
        for (Integer integer : temp) {
            ans = Math.min(ans, Math.abs(index - integer));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        char ch=sc.next().charAt(0);
        int[] ans=shortestToChar(s,ch);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
