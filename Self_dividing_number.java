package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Self_dividing_number {
    public static List<Integer> selfDividingNumbers(int left,int right){
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            boolean temp=selfDividingNumbersHelper(i);
            if(temp){
                ans.add(i);
            }
        }
        return ans;
    }
    public static boolean selfDividingNumbersHelper(int n){
        int temp=n;
        while(temp>0){
            int a=temp%10;
            if(a==0){
                return false;
            }
            if(n%a!=0){
                return false;
            }
            temp=temp/10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int left= sc.nextInt();
        int right= sc.nextInt();
        ArrayList<Integer> ans= (ArrayList<Integer>) selfDividingNumbers(left,right);
        for (Integer an : ans) {
            System.out.print(an + " ");
        }
    }
}
