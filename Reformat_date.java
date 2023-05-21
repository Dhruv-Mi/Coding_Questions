package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Reformat_date {
    public static String reformatDate(String date){
        String[] month={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String[] str=date.split(" ");
        String year=str[2];
        String day=str[0].substring(0,2);
        String mon=str[1];
        int count=0;
        for(int i=0;i< month.length;i++){
            if(Objects.equals(mon, month[i])){
                count=i+1;
                break;
            }
        }
        String temp="";
        if(count<10){
            temp=temp+"0"+count;
        }
        else{
            temp=temp+count;
        }
        String ans="";
        if(day.charAt(1)>='0' && day.charAt(1)<='9'){
            ans=ans+day;
        }
        else{
            ans=ans+"0"+day.charAt(0);
        }
        return year+"-"+temp+"-"+ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String date= sc.nextLine();
        String ans=reformatDate(date);
        System.out.println(ans);
    }
}
