package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class shortest_subsequence {
    public static int solve(String S,String V){

        int[][] storage = new int[S.length()+1][V.length()+1];
        for(int[] i : storage) {
            Arrays.fill(i, -1);
        }
        return solve(S, V, storage);


    }
    public static int solve(String S,String V,int[][] storage){
        int m = S.length();
        int n = V.length();
        if(storage[m][n]!=-1) {
            return storage[m][n];
        }

        if(S.length()==0) {
            storage[m][n] = Integer.MAX_VALUE;
            return storage[m][n];
        }
        if(V.length()==0) {
            storage[m][n] = 1;
            return storage[m][n];
        }
        int k = Integer.MAX_VALUE;
        //search for 1st character of S in v and store the index at k
        for(int i=0;i<V.length();i++) {

            if( V.charAt(i) == S.charAt(0)) {
                k = i;
                break;
            }

        }
        if(k==Integer.MAX_VALUE) {
            storage[m][n]= 1;
            return storage[m][n];
        }
        //1st case when 1st character of S is not part of substring
        int count1 = solve(S.substring(1), V, storage);
        //2nd case when 1st character is part of the substring
        int count2 = solve(S.substring(1), V.substring(k+1), storage);

        if(count2!=Integer.MAX_VALUE) {
            count2++;
        }
        storage[m][n] =  Math.min(count1, count2);
        return storage[m][n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        String t= sc.next();
        int ans=solve(s,t);
        System.out.println(ans);
    }
}
