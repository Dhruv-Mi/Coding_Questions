package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Assign_cookies {
    public static int findContentChildren(int[] g,int[] s){
        ArrayList<Integer> greed=new ArrayList<>();
        ArrayList<Integer> size=new ArrayList<>();
        for (int k : g) {
            greed.add(k);
        }
        for (int k : s) {
            size.add(k);
        }
        int count=0;
        for (Integer integer : greed) {
            for (int j = 0; j < size.size(); j++) {
                if (integer <= size.get(j)) {
                    count++;
                    size.remove(j);
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[] g=new int[n];
        int[] s=new int[m];
        for(int i=0;i<n;i++){
            g[i]= sc.nextInt();
        }
        for(int i=0;i<m;i++){
            s[i]= sc.nextInt();
        }
        int ans=findContentChildren(g,s);
        System.out.println(ans);
    }
}
