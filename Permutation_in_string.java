package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation_in_string {
    private static String swap(String a,int i,int j){
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    private static void backTrack(String s,int idx,int n,ArrayList<String> out){
        if (idx == n)
            out.add(s);
        else {
            for (int i = idx; i <= n; i++) {
                s = swap(s, idx, i);
                backTrack(s, idx + 1, n,out);
                s = swap(s, idx, i);
            }
        }
    }
    public static boolean checkInclusion(String s1,String s2){
        int length=s1.length();
        ArrayList<String> permutations=new ArrayList<>();
        backTrack(s1,0,length-1,permutations);
        for (String permutation : permutations) {
            if (s2.contains(permutation)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= sc.next();
        String s2= sc.next();
        boolean ans=checkInclusion(s1,s2);
        System.out.println(ans);
    }
}
