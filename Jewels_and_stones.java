package com.company;

import java.util.Scanner;

public class Jewels_and_stones {
    public static int numJewelsInStones(String jewels,String stones){
        int ans=0;
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            if(jewels.contains(ch+"")){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String jewels= sc.next();
        String stones= sc.next();
        int ans=numJewelsInStones(jewels,stones);
        System.out.println(ans);
    }
}
