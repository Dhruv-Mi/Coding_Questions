package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Positions_of_large_groups {
    public static ArrayList<ArrayList<Integer>> largeGroupPositions(String s){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if (s.length() >= 2) {
            int start = 0;
            int end = 0;
            for (int i = 1; i < s.length(); i++) {
                char present = s.charAt(i);
                char previous = s.charAt(i - 1);
                if (present != previous) {
                    if (end - start >= 2) {
                        ArrayList<Integer> subAns=new ArrayList<>();
                        subAns.add(start);
                        subAns.add(end);
                        ans.add(subAns);
                    }
                    start = i;
                }
                end = i;
            }
            if(end-start>=2){
                ArrayList<Integer> subAns=new ArrayList<>();
                subAns.add(start);
                subAns.add(end);
                ans.add(subAns);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        ArrayList<ArrayList<Integer>> ans=largeGroupPositions(s);
        for (ArrayList<Integer> an : ans) {
            for (int j = 0; j < 2; j++) {
                System.out.print(an.get(j) + " ");
            }
            System.out.println();
        }
    }
}
