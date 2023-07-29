package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Soup_serving {
    public static double soupServings(int n){
        if(n>=4800){
            return 1;
        }
        HashMap<String,Double> map=new HashMap<>();
        return soupServingsHelper(n,n,map);
    }
    public static double soupServingsHelper(int a,int b,HashMap<String,Double> map){
        if(map.containsKey(a+" "+b)){
            return map.get(a+" "+b);
        }
        else{
            if(a<=0 && b<=0){
                return 0.5;
            }
            if(a<=0){
                return 1;
            }
            if(b<=0){
                return 0;
            }
            double ans1=soupServingsHelper(a-100,b,map);
            double ans2=soupServingsHelper(a-75,b-25,map);
            double ans3=soupServingsHelper(a-50,b-50,map);
            double ans4=soupServingsHelper(a-25,b-75,map);

            double ans=0.25*(ans1+ans2+ans3+ans4);
            map.put(a+" "+b,ans);
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        double ans=soupServings(n);
        System.out.println(ans);
    }
}
