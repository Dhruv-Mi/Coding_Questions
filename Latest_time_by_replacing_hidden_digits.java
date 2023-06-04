package com.company;

import java.util.Scanner;

public class Latest_time_by_replacing_hidden_digits {
    public static String maximumTime(String time){
        int length=time.length();
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<length;i++){
            char ch=time.charAt(i);
            if(ch=='?'){
                if(i==0){
                    char forward=time.charAt(1);
                    if(forward=='?') {
                        ans.append('2');
                        time = '2' + time.substring(1);
                    }
                    else{
                        if(forward<='3'){
                            ans.append('2');
                            time = '2' + time.substring(1);
                        }
                        else{
                            ans.append('1');
                            time = '1' + time.substring(1);
                        }
                    }
                }
                else if(i==1){
                    char previous=time.charAt(0);
                    if(previous=='2'){
                        ans.append('3');
                    }
                    else{
                        ans.append('9');
                    }
                }
                else if(i==3){
                    ans.append('5');
                }
                else if(i==4){
                    ans.append('9');
                }
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String time= sc.next();
        String ans=maximumTime(time);
        System.out.println(ans);
    }
}
