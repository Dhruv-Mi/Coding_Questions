package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Check_if_two_arrays_are_equal_or_not {
    public static boolean check(long[] a,long[] b){
        if(a.length!=b.length){
            return false;
        }
        else {
            HashMap<Long, Integer> map = new HashMap<>();
            for (long l : a) {
                if (map.containsKey(l)) {
                    map.put(l, map.get(l) + 1);
                } else {
                    map.put(l, 1);
                }
            }
            for (long l : b) {
                if (map.containsKey(l)) {
                    if (map.get(l) > 1) {
                        map.put(l, map.get(l) - 1);
                    } else {
                        map.remove(l);
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n= sc.nextInt();
        long[] a=new long[m];
        long[] b=new long[n];
        for(int i=0;i<m;i++){
            a[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]= sc.nextInt();
        }
        boolean ans=check(a,b);
        System.out.println(ans);
    }
}
