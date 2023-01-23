package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Find_the_town_judge {
    public static int findJudge(int n,int[][] trust){
        int[] trust_label=new int[n+1];
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int[] ints : trust) {
            int index = ints[0];
            if (trust_label[index] == 0) {
                trust_label[index] = 1;
            }
        }
        int possible_judge=-1;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<n+1;i++){
            if(trust_label[i]==0){
                arr.add(i);
            }
        }
        if(arr.size()==1){
            possible_judge= arr.get(0);
        }
        if(possible_judge==-1){
            return -1;
        }
        else{
            for (int[] ints : trust) {
                int first = ints[0];
                int second = ints[1];
                if (map.containsKey(first)) {
                    if (map.get(first) != possible_judge && second == possible_judge) {
                        map.put(first, possible_judge);
                    }
                } else {
                    map.put(first, second);
                }
            }
            for(int i=1;i<n+1;i++){
                if(map.containsKey(i) && map.get(i)!=possible_judge) {
                    return -1;
                }
            }
            return possible_judge;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] input=new int[n][2];
        int num= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                input[i][j]= sc.nextInt();
            }
        }
        int ans=findJudge(num,input);
        System.out.println(ans);
    }
}
