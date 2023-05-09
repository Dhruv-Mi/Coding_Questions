package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Destination_city {
    public static String destCity(List<List<String>> paths){
        ArrayList<String> source=new ArrayList<>();
        ArrayList<String> destination=new ArrayList<>();
        for (List<String> temp : paths) {
            String s = temp.get(0);
            String d = temp.get(1);
            if (!source.contains(s)) {
                source.add(s);
            }
            if (!destination.contains(d)) {
                destination.add(d);
            }
        }
        String ans="";
        for (String s : destination) {
            if (!source.contains(s)) {
                return s;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        List<List<String>> paths=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<String> temp=new ArrayList<>();
            String s= sc.next();
            temp.add(s);
            s= sc.next();
            temp.add(s);
            paths.add(temp);
        }
        String ans=destCity(paths);
        System.out.println(ans);
    }
}
