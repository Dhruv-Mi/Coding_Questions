package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Find_all_numbers_disappeared_in_an_array {
    public static ArrayList<Integer> findDisappearedNumbers(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for (int j : nums) {
            if (!map.containsKey(j)) {
                map.put(j, 1);
            }
        }
        int num=1;
        while(num<=nums.length){
            if(!map.containsKey(num)){
                ans.add(num);
            }
            num++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        ArrayList<Integer> ans=findDisappearedNumbers(input);
        for (Integer an : ans) {
            System.out.print(an + " ");
        }
    }
}
