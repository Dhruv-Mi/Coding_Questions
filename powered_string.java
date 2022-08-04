package com.company;

import java.util.Scanner;

public class powered_string {
//    public static int poweredStringHelp(int a,int b,String s){
//        if(s.length()==0){
//            return 0;
//        }
//        int count0=0;
//        int count1=0;
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)=='0'){
//                count0++;
//            }
//            else{
//                count1++;
//            }
//        }
//        return (a*count1)-(b*count0);
//    }
    public static int poweredString(int a,int b,String s){
        if(s.length()==0){
            return 0;
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                int count0 = 0;
                int count1 = 0;
                for (int k = 0; k < temp.length(); k++) {
                    if (temp.charAt(k) == '0') {
                        count0++;
                    } else {
                        count1++;
                    }
                }
                int tempAns = (a * count1) - (b * count0);
                ans = Math.max(ans, tempAns);
            }
        }
        return Math.max(ans, 0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int a= sc.nextInt();
            int b= sc.nextInt();
            String input= sc.next();
            int ans=poweredString(a,b,input);
            System.out.println(ans);
        }
    }
}
