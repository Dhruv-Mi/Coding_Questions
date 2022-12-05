package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Remove_bad_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            int n= sc.nextInt();
            int[] input=new int[n];
            HashMap<Integer,Integer> map=new HashMap<>();
            for (int j=0;j<n;j++){
                int element= sc.nextInt();
                input[j]=element;
                if(map.containsKey(element)){
                    map.replace(element, map.get(element), map.get(element)+1);
                }
                else {
                    map.put(element,1);
                }
            }
            int max=0;
            for (int k=0;k< n;k++){
                if(max< map.get(input[k])){
                    max=map.get(input[k]);
                }
            }
            System.out.println(n-max);
        }
    }
}
