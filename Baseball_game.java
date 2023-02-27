package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Baseball_game {
    public static int calPoint(String[] operations){
        ArrayList<Integer> arr=new ArrayList<>();
        for (String ch : operations) {
            if (Objects.equals(ch, "+")) {
                int temp1 = arr.get(arr.size() - 1);
                int temp2 = arr.get(arr.size() - 2);
                arr.add(temp1 + temp2);
            } else if (Objects.equals(ch, "D")) {
                int temp1 = arr.get(arr.size() - 1);
                arr.add(temp1 * 2);
            } else if (Objects.equals(ch, "C")) {
                arr.remove(arr.size() - 1);
            } else {
                int temp = Integer.parseInt(ch);
                arr.add(temp);
            }
        }
        int sum=0;
        for (Integer integer : arr) {
            sum = sum + integer;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String[] operations=new String[n];
        for(int i=0;i<n;i++){
            operations[i]= sc.next();
        }
        int ans=calPoint(operations);
        System.out.println(ans);
    }
}
