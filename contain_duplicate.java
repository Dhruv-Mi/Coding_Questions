package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class contain_duplicate {
    public static boolean containsDuplicate(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            } else {
                map.put(num, 1);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        boolean ans=containsDuplicate(input);
        System.out.println(ans);
    }
}
