package com.company;

import java.util.Scanner;

public class roman_to_integer {
    public static int romanToInt(String s){
        int len=s.length();
        int count=0;
        for(int i=0;i<len;i++){
            int ch=s.charAt(i);
            if(ch=='V'){
                count+=5;
            }
            else if(ch=='L'){
                count+=50;
            }
            else if(ch=='D'){
                count+=500;
            }
            else if(ch=='M'){
                count+=1000;
            }
            else if(ch=='I'){
                if(i!=len-1){
                    char ch2=s.charAt(i+1);
                    if(ch2=='V'){
                        count+=4;
                        i++;
                    }
                    else if(ch2=='X'){
                        count+=9;
                        i++;
                    }
                    else{
                        count++;
                    }
                }
                else{
                    count++;
                }
            }
            else if(ch=='X'){
                if(i!=len-1){
                    char ch2=s.charAt(i+1);
                    if(ch2=='L'){
                        count+=40;
                        i++;
                    }
                    else if(ch2=='C'){
                        count+=90;
                        i++;
                    }
                    else{
                        count+=10;
                    }
                }
                else{
                    count+=10;
                }
            }
            else if(ch=='C'){
                if(i!=len-1){
                    char ch2=s.charAt(i+1);
                    if(ch2=='D'){
                        count+=400;
                        i++;
                    }
                    else if(ch2=='M'){
                        count+=900;
                        i++;
                    }
                    else{
                        count+=100;
                    }
                }
                else{
                    count+=100;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.nextLine();
        int ans=romanToInt(input);
        System.out.println(ans);
    }
}
