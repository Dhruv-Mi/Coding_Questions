package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Last_stone_weight {
    public static int lastStoneWeight(int[] stones){
        ArrayList<Integer> arr=new ArrayList<>();
        Arrays.sort(stones);
        for (int stone : stones) {
            arr.add(stone);
        }
        while(arr.size()>1){
            int stone1= arr.get(arr.size()-1);
            int stone2=arr.get(arr.size()-2);
            if(stone1==stone2){
                arr.remove(arr.size()-1);
                arr.remove(arr.size()-1);
            }
            else{
                int temp=stone1-stone2;
                arr.remove(arr.size()-1);
                arr.remove(arr.size()-1);
                arr.add(temp);
            }
            Collections.sort(arr);
        }
        if(arr.size()!=0){
            return arr.get(0);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] stones=new int[n];
        for(int i=0;i<n;i++){
            stones[i]= sc.nextInt();
        }
        int ans=lastStoneWeight(stones);
        System.out.println(ans);
    }
}
