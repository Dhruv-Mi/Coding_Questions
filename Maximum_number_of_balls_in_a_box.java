package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Maximum_number_of_balls_in_a_box {
    public static int countBalls(int lowLimit,int highLimit){
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=Integer.MIN_VALUE;
        for(int i=lowLimit;i<=highLimit;i++){
            int sum=0;
            int temp=i;
            while(temp!=0){
                sum=sum+(temp%10);
                temp=temp/10;
            }
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
                ans=Math.max(ans, map.get(sum));
            }
            else{
                map.put(sum,1);
                ans=Math.max(ans,1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int lowLimit= sc.nextInt();
        int highLimit= sc.nextInt();
        int ans=countBalls(lowLimit,highLimit);
        System.out.println(ans);
    }
}
