package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Counting_bits {
    public static int count_1(int i){
        String temp=Integer.toBinaryString(i);
        int count=0;
        for(int j=0;j<temp.length();j++){
            if(temp.charAt(j)=='1'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer> output=new ArrayList<>();
        for(int i=0;i<=n;i++){
            int temp=count_1(i);
            output.add(temp);
        }
        for (Integer integer : output) {
            System.out.print(integer + " ");
        }
    }
}
