package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Pascals_triangle {
    public static ArrayList<ArrayList<Integer>> generate(int n){
        ArrayList<ArrayList<Integer>> output=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> column=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    column.add(1);
                }
                else{
                    column.add(j,output.get(i-1).get(j-1)+output.get(i-1).get(j));
                }
            }
            output.add(column);
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<ArrayList<Integer>> ans=generate(n);
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
