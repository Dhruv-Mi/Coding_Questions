package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Number_of_different_integers_in_a_string {
    public static int numDifferentIntegers(String word){
        int length=word.length();
        if(length==1){
            if(word.charAt(0)>='0' && word.charAt(0)<='9'){
                return 1;
            }
            else{
                return 0;
            }
        }
        ArrayList<String> arr=new ArrayList<>();
        StringBuilder temp= new StringBuilder();
        int check=0;
        int count=0;
        for(int i=0;i<length;i++){
            char ch=word.charAt(i);
            if(ch>='0' && ch<='9'){
                if(check==0 && ch!='0') {
                    temp.append(ch);
                    check=1;
                }
                else if(check==1){
                    temp.append(ch);
                }
            }
            else{
                if(!temp.toString().equals("")) {
                    if (!arr.contains(temp.toString())) {
                        arr.add(temp.toString());
                    }
                    temp = new StringBuilder();
                    check=0;
                }
            }
        }
        if(!temp.toString().equals("")){
            if (!arr.contains(temp.toString())) {
                arr.add(temp.toString());
            }
        }
        for(int i=0;i<length;i++){
            char ch=word.charAt(i);
            if(ch=='0'){
                if(i==0){
                    if(word.charAt(1)<'0' || word.charAt(1)>'9'){
                        count=1;
                        break;
                    }
                }
                else if(i==length-1){
                    if(word.charAt(length-2)<'0' || word.charAt(length-2)>'9'){
                        count=1;
                        break;
                    }
                }
                else{
                    if((word.charAt(i-1)<'0' || word.charAt(i-1)>'9') && (word.charAt(i+1)<'0' || word.charAt(i+1)>'9')){
                        count=1;
                        break;
                    }
                }
            }
        }
        return arr.size()+count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word= sc.next();
        int ans=numDifferentIntegers(word);
        System.out.println(ans);
    }
}
