package com.company;

import java.util.*;

public class Minimum_cost_to_move_chips_to_the_same_position {
    public static int minCostToMoveChips(int[] position){
        ArrayList<Integer> destination=new ArrayList<>();
        for (int k : position) {
            if (!destination.contains(k)) {
                destination.add(k);
            }
        }
        int ans=Integer.MAX_VALUE;
        for (int dest : destination) {
            int temp = 0;
            for (int i : position) {
                if (dest != i) {
                    temp = temp + ((dest + i) % 2);
                }
            }
            ans = Math.min(ans, temp);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] position=new int[n];
        for(int i=0;i<n;i++){
            position[i]= sc.nextInt();
        }
        int ans=minCostToMoveChips(position);
        System.out.println(ans);
    }
}
