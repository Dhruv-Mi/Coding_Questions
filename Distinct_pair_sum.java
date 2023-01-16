package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Distinct_pair_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int l= sc.nextInt();
            int r= sc.nextInt();
            ArrayList<Integer> check=new ArrayList<>();
            for(int j=l;j<=r;j++){
                for(int k=j;k<=r;k++){
                    int temp=j+k;
                    if(!check.contains(temp)){
                        check.add(temp);
                    }
                }
            }
            System.out.println(check.size());
        }
    }
}
