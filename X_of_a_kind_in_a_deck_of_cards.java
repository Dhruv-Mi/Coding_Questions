package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class X_of_a_kind_in_a_deck_of_cards {
    public static boolean hasGroupSizeX(int[] deck) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int res = 0;
        for (int i : deck) count.put(i, count.getOrDefault(i, 0) + 1);
        for (int i : count.values()) res = gcd(i, res);
        return res > 1;
    }

    public static int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] deck=new int[n];
        for(int i=0;i<n;i++){
            deck[i]= sc.nextInt();
        }
        boolean ans=hasGroupSizeX(deck);
        System.out.println(ans);
    }
}
