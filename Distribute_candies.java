package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Distribute_candies {
    public static int distributeCandies(int[] candyType){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int j : candyType) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        int temp=candyType.length/2;
        return Math.min(temp, map.size());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] candyType=new int[n];
        for(int i=0;i<n;i++){
            candyType[i]= sc.nextInt();
        }
        int ans=distributeCandies(candyType);
        System.out.println(ans);
    }
}
