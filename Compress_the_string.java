package com.company;

import java.util.Scanner;

public class Compress_the_string {
    public static String getCompressedString(String str){
        String output="";
        int i,len=str.length();
        int k=1;
        char lastchar=str.charAt(0);
        for(i=1;i<len;i++){
            if(str.charAt(i)!=lastchar&&(k==1)){
                output=output+lastchar;
                lastchar=str.charAt(i);
                k=1;
            }
            else if(str.charAt(i)!=lastchar&&(k!=1)){
                output=output+lastchar+k;
                lastchar=str.charAt(i);
                k=1;
            }
            else{
                k++;
            }
        }
        if(k==1){
            output=output+str.charAt(len-1);
        }
        else{
            output=output+str.charAt(len-1)+k;
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.nextLine();
        String output=getCompressedString(input);
        System.out.println(output);
    }
}
