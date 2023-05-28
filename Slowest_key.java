package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Slowest_key {
    public static char slowestKey(int[] releaseTime,String keysPressed){
        int n= releaseTime.length;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=keysPressed.charAt(i);
            int time;
            if(i==0){
                time=releaseTime[0];
            }
            else{
                time=releaseTime[i]-releaseTime[i-1];
            }
            if(map.containsKey(ch)){
                int temp= map.get(ch);
                if(temp<time){
                    map.put(ch,time);
                }
            }
            else{
                map.put(ch,time);
            }
        }
        Character[] key=map.keySet().toArray(new Character[0]);
        char ans=key[0];
        int value= map.get(ans);
        for(int i=1;i<key.length;i++){
            char ch=key[i];
            int val=map.get(ch);
            if(val>value){
                ans=ch;
                value=val;
            }
            else if(val==value && ch>ans){
                ans=ch;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] releaseTime=new int[n];
        for(int i=0;i<n;i++){
            releaseTime[i]= sc.nextInt();
        }
        String keysPressed=sc.next();
        char  ans=slowestKey(releaseTime,keysPressed);
        System.out.println(ans);
    }
}
